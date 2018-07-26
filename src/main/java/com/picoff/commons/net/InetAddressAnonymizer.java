/*
 * Copyright (c) 2018 Picoff Ventures and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.picoff.commons.net;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public final class InetAddressAnonymizer {
    /**
     * IPv4 addresses have their length truncated to 24 bits, IPv6 to 48 bits
     */
    public static InetAddress anonymize(final InetAddress inetAddress) throws UnknownHostException {
        if (inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress()) {
            return inetAddress;
        }

        final int mask = inetAddress instanceof Inet4Address ? 24 : 48;
        return truncate(inetAddress, mask);
    }

    public static InetAddress truncate(final InetAddress address, final int maskLength) throws UnknownHostException {
        final int addressLength = address instanceof Inet4Address ? 4 : 16;
        final int maxMaskLength = addressLength * 8;

        if (maskLength < 0 || maskLength > maxMaskLength) {
            throw new IllegalArgumentException("invalid mask length");
        }

        if (maskLength == maxMaskLength) {
            return address;
        }

        final byte[] bytes = address.getAddress();

        for (int i = maskLength / 8 + 1; i < bytes.length; i++) {
            bytes[i] = 0;
        }

        final int maskBits = maskLength % 8;

        int mask = 0;
        for (int i = 0; i < maskBits; i++) {
            mask |= (1 << (7 - i));
        }

        bytes[maskLength / 8] &= mask;

        return InetAddress.getByAddress(bytes);
    }
}
