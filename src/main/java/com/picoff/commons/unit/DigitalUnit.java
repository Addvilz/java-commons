package com.picoff.commons.unit;

public enum DigitalUnit {

    BYTE {
        @Override
        public String symbol() {
            return "B";
        }

        @Override
        public String displayName() {
            return "byte";
        }

        @Override
        public int pow() {
            return 0;
        }

        @Override
        public int powOf() {
            return 0;
        }

        @Override
        public String format(final double value) {
            return DigitalUnit.format(value, BYTE, true);
        }

        @Override
        public double toBytes(final double byteValue) {
            return byteValue;
        }

        @Override
        public double toKilobytes(final double byteValue) {
            return byteValue / 1000L;
        }

        @Override
        public double toMegabytes(final double byteValue) {
            return byteValue / 1000000L;
        }

        @Override
        public double toGigabytes(final double byteValue) {
            return byteValue / 1000000000L;
        }

        @Override
        public double toTerabytes(final double byteValue) {
            return byteValue / 1000000000000L;
        }

        @Override
        public double toPetabytes(final double byteValue) {
            return byteValue / 1000000000000000L;
        }

        @Override
        public double toExabytes(final double byteValue) {
            return byteValue / 1000000000000000000L;
        }

        @Override
        public double toKibibytes(final double byteValue) {
            return byteValue / 1024L;
        }

        @Override
        public double toMebibytes(final double byteValue) {
            return byteValue / 1048576L;
        }

        @Override
        public double toGibibytes(final double byteValue) {
            return byteValue / 1073741824L;
        }

        @Override
        public double toTebibytes(final double byteValue) {
            return byteValue / 1099511627776L;
        }

        @Override
        public double toPebibytes(final double byteValue) {
            return byteValue / 1125899906842624L;
        }

        @Override
        public double toExbibytes(final double byteValue) {
            return byteValue / 1152921504606846976L;
        }

        @Override
        public double fromBytes(final double byteValue) {
            return byteValue;
        }

        @Override
        public double fromKilobytes(final double kilobyteValue) {
            return kilobyteValue * 1000L;
        }

        @Override
        public double fromMegabytes(final double megabyteValue) {
            return megabyteValue * 1000000L;
        }

        @Override
        public double fromGigabytes(final double gigabyteValue) {
            return gigabyteValue * 1000000000L;
        }

        @Override
        public double fromTerabytes(final double terabyteValue) {
            return terabyteValue * 1000000000000L;
        }

        @Override
        public double fromPetabytes(final double petabyteValue) {
            return petabyteValue * 1000000000000000L;
        }

        @Override
        public double fromExabytes(final double exabyteValue) {
            return exabyteValue * 1000000000000000000L;
        }

        @Override
        public double fromKibibytes(final double kibibyteValue) {
            return kibibyteValue * 1024L;
        }

        @Override
        public double fromMebibytes(final double mebibyteValue) {
            return mebibyteValue * 1048576L;
        }

        @Override
        public double fromGibibytes(final double gibibyteValue) {
            return gibibyteValue * 1073741824L;
        }

        @Override
        public double fromTebibytes(final double tebibyteValue) {
            return tebibyteValue * 1099511627776L;
        }

        @Override
        public double fromPebibytes(final double pebibyteValue) {
            return pebibyteValue * 1125899906842624L;
        }

        @Override
        public double fromExbibytes(final double exbibyteValue) {
            return exbibyteValue * 1152921504606846976L;
        }
    },

    KILOBYTE {
        @Override
        public String symbol() {
            return "kB";
        }

        @Override
        public String displayName() {
            return "kilobyte";
        }

        @Override
        public int pow() {
            return 1;
        }

        @Override
        public int powOf() {
            return 1000;
        }

        @Override
        public String format(final double value) {
            return DigitalUnit.format(value, KILOBYTE, true);
        }

        @Override
        public double toBytes(final double kilobyteValue) {
            return kilobyteValue * 1000L;
        }

        @Override
        public double toKilobytes(final double kilobyteValue) {
            return kilobyteValue;
        }

        @Override
        public double toMegabytes(final double kilobyteValue) {
            return kilobyteValue / 1000L;
        }

        @Override
        public double toGigabytes(final double kilobyteValue) {
            return kilobyteValue / 1000000L;
        }

        @Override
        public double toTerabytes(final double kilobyteValue) {
            return kilobyteValue / 1000000000L;
        }

        @Override
        public double toPetabytes(final double kilobyteValue) {
            return kilobyteValue / 1000000000000L;
        }

        @Override
        public double toExabytes(final double kilobyteValue) {
            return kilobyteValue / 1000000000000000L;
        }

        @Override
        public double toKibibytes(final double kilobyteValue) {
            return kilobyteValue * 1L;
        }

        @Override
        public double toMebibytes(final double kilobyteValue) {
            return kilobyteValue / 1024L;
        }

        @Override
        public double toGibibytes(final double kilobyteValue) {
            return kilobyteValue / 1048576L;
        }

        @Override
        public double toTebibytes(final double kilobyteValue) {
            return kilobyteValue / 1073741824L;
        }

        @Override
        public double toPebibytes(final double kilobyteValue) {
            return kilobyteValue / 1099511627776L;
        }

        @Override
        public double toExbibytes(final double kilobyteValue) {
            return kilobyteValue / 1125899906842624L;
        }

        @Override
        public double fromBytes(final double byteValue) {
            return byteValue / 1000L;
        }

        @Override
        public double fromKilobytes(final double kilobyteValue) {
            return kilobyteValue;
        }

        @Override
        public double fromMegabytes(final double megabyteValue) {
            return megabyteValue * 1000L;
        }

        @Override
        public double fromGigabytes(final double gigabyteValue) {
            return gigabyteValue * 1000000L;
        }

        @Override
        public double fromTerabytes(final double terabyteValue) {
            return terabyteValue * 1000000000L;
        }

        @Override
        public double fromPetabytes(final double petabyteValue) {
            return petabyteValue * 1000000000000L;
        }

        @Override
        public double fromExabytes(final double exabyteValue) {
            return exabyteValue * 1000000000000000L;
        }

        @Override
        public double fromKibibytes(final double kibibyteValue) {
            return kibibyteValue / 1L;
        }

        @Override
        public double fromMebibytes(final double mebibyteValue) {
            return mebibyteValue * 1024L;
        }

        @Override
        public double fromGibibytes(final double gibibyteValue) {
            return gibibyteValue * 1048576L;
        }

        @Override
        public double fromTebibytes(final double tebibyteValue) {
            return tebibyteValue * 1073741824L;
        }

        @Override
        public double fromPebibytes(final double pebibyteValue) {
            return pebibyteValue * 1099511627776L;
        }

        @Override
        public double fromExbibytes(final double exbibyteValue) {
            return exbibyteValue * 1125899906842624L;
        }
    },

    MEGABYTE {
        @Override
        public String symbol() {
            return "MB";
        }

        @Override
        public String displayName() {
            return "megabyte";
        }

        @Override
        public int pow() {
            return 2;
        }

        @Override
        public int powOf() {
            return 1000;
        }

        @Override
        public String format(final double value) {
            return DigitalUnit.format(value, MEGABYTE, true);
        }

        @Override
        public double toBytes(final double megabyteValue) {
            return megabyteValue * 1000000L;
        }

        @Override
        public double toKilobytes(final double megabyteValue) {
            return megabyteValue * 1000L;
        }

        @Override
        public double toMegabytes(final double megabyteValue) {
            return megabyteValue;
        }

        @Override
        public double toGigabytes(final double megabyteValue) {
            return megabyteValue / 1000L;
        }

        @Override
        public double toTerabytes(final double megabyteValue) {
            return megabyteValue / 1000000L;
        }

        @Override
        public double toPetabytes(final double megabyteValue) {
            return megabyteValue / 1000000000L;
        }

        @Override
        public double toExabytes(final double megabyteValue) {
            return megabyteValue / 1000000000000L;
        }

        @Override
        public double toKibibytes(final double megabyteValue) {
            return megabyteValue * 1024L;
        }

        @Override
        public double toMebibytes(final double megabyteValue) {
            return megabyteValue * 1L;
        }

        @Override
        public double toGibibytes(final double megabyteValue) {
            return megabyteValue / 1024L;
        }

        @Override
        public double toTebibytes(final double megabyteValue) {
            return megabyteValue / 1048576L;
        }

        @Override
        public double toPebibytes(final double megabyteValue) {
            return megabyteValue / 1073741824L;
        }

        @Override
        public double toExbibytes(final double megabyteValue) {
            return megabyteValue / 1099511627776L;
        }

        @Override
        public double fromBytes(final double byteValue) {
            return byteValue / 1000000L;
        }

        @Override
        public double fromKilobytes(final double kilobyteValue) {
            return kilobyteValue / 1000L;
        }

        @Override
        public double fromMegabytes(final double megabyteValue) {
            return megabyteValue;
        }

        @Override
        public double fromGigabytes(final double gigabyteValue) {
            return gigabyteValue * 1000L;
        }

        @Override
        public double fromTerabytes(final double terabyteValue) {
            return terabyteValue * 1000000L;
        }

        @Override
        public double fromPetabytes(final double petabyteValue) {
            return petabyteValue * 1000000000L;
        }

        @Override
        public double fromExabytes(final double exabyteValue) {
            return exabyteValue * 1000000000000L;
        }

        @Override
        public double fromKibibytes(final double kibibyteValue) {
            return kibibyteValue / 1024L;
        }

        @Override
        public double fromMebibytes(final double mebibyteValue) {
            return mebibyteValue / 1L;
        }

        @Override
        public double fromGibibytes(final double gibibyteValue) {
            return gibibyteValue * 1024L;
        }

        @Override
        public double fromTebibytes(final double tebibyteValue) {
            return tebibyteValue * 1048576L;
        }

        @Override
        public double fromPebibytes(final double pebibyteValue) {
            return pebibyteValue * 1073741824L;
        }

        @Override
        public double fromExbibytes(final double exbibyteValue) {
            return exbibyteValue * 1099511627776L;
        }
    },

    GIGABYTE {
        @Override
        public String symbol() {
            return "GB";
        }

        @Override
        public String displayName() {
            return "gigabyte";
        }

        @Override
        public int pow() {
            return 3;
        }

        @Override
        public int powOf() {
            return 1000;
        }

        @Override
        public String format(final double value) {
            return DigitalUnit.format(value, GIGABYTE, true);
        }

        @Override
        public double toBytes(final double gigabyteValue) {
            return gigabyteValue * 1000000000L;
        }

        @Override
        public double toKilobytes(final double gigabyteValue) {
            return gigabyteValue * 1000000L;
        }

        @Override
        public double toMegabytes(final double gigabyteValue) {
            return gigabyteValue * 1000L;
        }

        @Override
        public double toGigabytes(final double gigabyteValue) {
            return gigabyteValue;
        }

        @Override
        public double toTerabytes(final double gigabyteValue) {
            return gigabyteValue / 1000L;
        }

        @Override
        public double toPetabytes(final double gigabyteValue) {
            return gigabyteValue / 1000000L;
        }

        @Override
        public double toExabytes(final double gigabyteValue) {
            return gigabyteValue / 1000000000L;
        }

        @Override
        public double toKibibytes(final double gigabyteValue) {
            return gigabyteValue * 1048576L;
        }

        @Override
        public double toMebibytes(final double gigabyteValue) {
            return gigabyteValue * 1024L;
        }

        @Override
        public double toGibibytes(final double gigabyteValue) {
            return gigabyteValue * 1L;
        }

        @Override
        public double toTebibytes(final double gigabyteValue) {
            return gigabyteValue / 1024L;
        }

        @Override
        public double toPebibytes(final double gigabyteValue) {
            return gigabyteValue / 1048576L;
        }

        @Override
        public double toExbibytes(final double gigabyteValue) {
            return gigabyteValue / 1073741824L;
        }

        @Override
        public double fromBytes(final double byteValue) {
            return byteValue / 1000000000L;
        }

        @Override
        public double fromKilobytes(final double kilobyteValue) {
            return kilobyteValue / 1000000L;
        }

        @Override
        public double fromMegabytes(final double megabyteValue) {
            return megabyteValue / 1000L;
        }

        @Override
        public double fromGigabytes(final double gigabyteValue) {
            return gigabyteValue;
        }

        @Override
        public double fromTerabytes(final double terabyteValue) {
            return terabyteValue * 1000L;
        }

        @Override
        public double fromPetabytes(final double petabyteValue) {
            return petabyteValue * 1000000L;
        }

        @Override
        public double fromExabytes(final double exabyteValue) {
            return exabyteValue * 1000000000L;
        }

        @Override
        public double fromKibibytes(final double kibibyteValue) {
            return kibibyteValue / 1048576L;
        }

        @Override
        public double fromMebibytes(final double mebibyteValue) {
            return mebibyteValue / 1024L;
        }

        @Override
        public double fromGibibytes(final double gibibyteValue) {
            return gibibyteValue / 1L;
        }

        @Override
        public double fromTebibytes(final double tebibyteValue) {
            return tebibyteValue * 1024L;
        }

        @Override
        public double fromPebibytes(final double pebibyteValue) {
            return pebibyteValue * 1048576L;
        }

        @Override
        public double fromExbibytes(final double exbibyteValue) {
            return exbibyteValue * 1073741824L;
        }
    },

    TERABYTE {
        @Override
        public String symbol() {
            return "TB";
        }

        @Override
        public String displayName() {
            return "terabyte";
        }

        @Override
        public int pow() {
            return 4;
        }

        @Override
        public int powOf() {
            return 1000;
        }

        @Override
        public String format(final double value) {
            return DigitalUnit.format(value, TERABYTE, true);
        }

        @Override
        public double toBytes(final double terabyteValue) {
            return terabyteValue * 1000000000000L;
        }

        @Override
        public double toKilobytes(final double terabyteValue) {
            return terabyteValue * 1000000000L;
        }

        @Override
        public double toMegabytes(final double terabyteValue) {
            return terabyteValue * 1000000L;
        }

        @Override
        public double toGigabytes(final double terabyteValue) {
            return terabyteValue * 1000L;
        }

        @Override
        public double toTerabytes(final double terabyteValue) {
            return terabyteValue;
        }

        @Override
        public double toPetabytes(final double terabyteValue) {
            return terabyteValue / 1000L;
        }

        @Override
        public double toExabytes(final double terabyteValue) {
            return terabyteValue / 1000000L;
        }

        @Override
        public double toKibibytes(final double terabyteValue) {
            return terabyteValue * 1073741824L;
        }

        @Override
        public double toMebibytes(final double terabyteValue) {
            return terabyteValue * 1048576L;
        }

        @Override
        public double toGibibytes(final double terabyteValue) {
            return terabyteValue * 1024L;
        }

        @Override
        public double toTebibytes(final double terabyteValue) {
            return terabyteValue * 1L;
        }

        @Override
        public double toPebibytes(final double terabyteValue) {
            return terabyteValue / 1024L;
        }

        @Override
        public double toExbibytes(final double terabyteValue) {
            return terabyteValue / 1048576L;
        }

        @Override
        public double fromBytes(final double byteValue) {
            return byteValue / 1000000000000L;
        }

        @Override
        public double fromKilobytes(final double kilobyteValue) {
            return kilobyteValue / 1000000000L;
        }

        @Override
        public double fromMegabytes(final double megabyteValue) {
            return megabyteValue / 1000000L;
        }

        @Override
        public double fromGigabytes(final double gigabyteValue) {
            return gigabyteValue / 1000L;
        }

        @Override
        public double fromTerabytes(final double terabyteValue) {
            return terabyteValue;
        }

        @Override
        public double fromPetabytes(final double petabyteValue) {
            return petabyteValue * 1000L;
        }

        @Override
        public double fromExabytes(final double exabyteValue) {
            return exabyteValue * 1000000L;
        }

        @Override
        public double fromKibibytes(final double kibibyteValue) {
            return kibibyteValue / 1073741824L;
        }

        @Override
        public double fromMebibytes(final double mebibyteValue) {
            return mebibyteValue / 1048576L;
        }

        @Override
        public double fromGibibytes(final double gibibyteValue) {
            return gibibyteValue / 1024L;
        }

        @Override
        public double fromTebibytes(final double tebibyteValue) {
            return tebibyteValue / 1L;
        }

        @Override
        public double fromPebibytes(final double pebibyteValue) {
            return pebibyteValue * 1024L;
        }

        @Override
        public double fromExbibytes(final double exbibyteValue) {
            return exbibyteValue * 1048576L;
        }
    },

    PETABYTE {
        @Override
        public String symbol() {
            return "PB";
        }

        @Override
        public String displayName() {
            return "petabyte";
        }

        @Override
        public int pow() {
            return 5;
        }

        @Override
        public int powOf() {
            return 1000;
        }

        @Override
        public String format(final double value) {
            return DigitalUnit.format(value, PETABYTE, true);
        }

        @Override
        public double toBytes(final double petabyteValue) {
            return petabyteValue * 1000000000000000L;
        }

        @Override
        public double toKilobytes(final double petabyteValue) {
            return petabyteValue * 1000000000000L;
        }

        @Override
        public double toMegabytes(final double petabyteValue) {
            return petabyteValue * 1000000000L;
        }

        @Override
        public double toGigabytes(final double petabyteValue) {
            return petabyteValue * 1000000L;
        }

        @Override
        public double toTerabytes(final double petabyteValue) {
            return petabyteValue * 1000L;
        }

        @Override
        public double toPetabytes(final double petabyteValue) {
            return petabyteValue;
        }

        @Override
        public double toExabytes(final double petabyteValue) {
            return petabyteValue / 1000L;
        }

        @Override
        public double toKibibytes(final double petabyteValue) {
            return petabyteValue * 1099511627776L;
        }

        @Override
        public double toMebibytes(final double petabyteValue) {
            return petabyteValue * 1073741824L;
        }

        @Override
        public double toGibibytes(final double petabyteValue) {
            return petabyteValue * 1048576L;
        }

        @Override
        public double toTebibytes(final double petabyteValue) {
            return petabyteValue * 1024L;
        }

        @Override
        public double toPebibytes(final double petabyteValue) {
            return petabyteValue * 1L;
        }

        @Override
        public double toExbibytes(final double petabyteValue) {
            return petabyteValue / 1024L;
        }

        @Override
        public double fromBytes(final double byteValue) {
            return byteValue / 1000000000000000L;
        }

        @Override
        public double fromKilobytes(final double kilobyteValue) {
            return kilobyteValue / 1000000000000L;
        }

        @Override
        public double fromMegabytes(final double megabyteValue) {
            return megabyteValue / 1000000000L;
        }

        @Override
        public double fromGigabytes(final double gigabyteValue) {
            return gigabyteValue / 1000000L;
        }

        @Override
        public double fromTerabytes(final double terabyteValue) {
            return terabyteValue / 1000L;
        }

        @Override
        public double fromPetabytes(final double petabyteValue) {
            return petabyteValue;
        }

        @Override
        public double fromExabytes(final double exabyteValue) {
            return exabyteValue * 1000L;
        }

        @Override
        public double fromKibibytes(final double kibibyteValue) {
            return kibibyteValue / 1099511627776L;
        }

        @Override
        public double fromMebibytes(final double mebibyteValue) {
            return mebibyteValue / 1073741824L;
        }

        @Override
        public double fromGibibytes(final double gibibyteValue) {
            return gibibyteValue / 1048576L;
        }

        @Override
        public double fromTebibytes(final double tebibyteValue) {
            return tebibyteValue / 1024L;
        }

        @Override
        public double fromPebibytes(final double pebibyteValue) {
            return pebibyteValue / 1L;
        }

        @Override
        public double fromExbibytes(final double exbibyteValue) {
            return exbibyteValue * 1024L;
        }
    },

    EXABYTE {
        @Override
        public String symbol() {
            return "EB";
        }

        @Override
        public String displayName() {
            return "exabyte";
        }

        @Override
        public int pow() {
            return 6;
        }

        @Override
        public int powOf() {
            return 1000;
        }

        @Override
        public String format(final double value) {
            return DigitalUnit.format(value, EXABYTE, true);
        }

        @Override
        public double toBytes(final double exabyteValue) {
            return exabyteValue * 1000000000000000000L;
        }

        @Override
        public double toKilobytes(final double exabyteValue) {
            return exabyteValue * 1000000000000000L;
        }

        @Override
        public double toMegabytes(final double exabyteValue) {
            return exabyteValue * 1000000000000L;
        }

        @Override
        public double toGigabytes(final double exabyteValue) {
            return exabyteValue * 1000000000L;
        }

        @Override
        public double toTerabytes(final double exabyteValue) {
            return exabyteValue * 1000000L;
        }

        @Override
        public double toPetabytes(final double exabyteValue) {
            return exabyteValue * 1000L;
        }

        @Override
        public double toExabytes(final double exabyteValue) {
            return exabyteValue;
        }

        @Override
        public double toKibibytes(final double exabyteValue) {
            return exabyteValue * 1125899906842624L;
        }

        @Override
        public double toMebibytes(final double exabyteValue) {
            return exabyteValue * 1099511627776L;
        }

        @Override
        public double toGibibytes(final double exabyteValue) {
            return exabyteValue * 1073741824L;
        }

        @Override
        public double toTebibytes(final double exabyteValue) {
            return exabyteValue * 1048576L;
        }

        @Override
        public double toPebibytes(final double exabyteValue) {
            return exabyteValue * 1024L;
        }

        @Override
        public double toExbibytes(final double exabyteValue) {
            return exabyteValue * 1L;
        }

        @Override
        public double fromBytes(final double byteValue) {
            return byteValue / 1000000000000000000L;
        }

        @Override
        public double fromKilobytes(final double kilobyteValue) {
            return kilobyteValue / 1000000000000000L;
        }

        @Override
        public double fromMegabytes(final double megabyteValue) {
            return megabyteValue / 1000000000000L;
        }

        @Override
        public double fromGigabytes(final double gigabyteValue) {
            return gigabyteValue / 1000000000L;
        }

        @Override
        public double fromTerabytes(final double terabyteValue) {
            return terabyteValue / 1000000L;
        }

        @Override
        public double fromPetabytes(final double petabyteValue) {
            return petabyteValue / 1000L;
        }

        @Override
        public double fromExabytes(final double exabyteValue) {
            return exabyteValue;
        }

        @Override
        public double fromKibibytes(final double kibibyteValue) {
            return kibibyteValue / 1125899906842624L;
        }

        @Override
        public double fromMebibytes(final double mebibyteValue) {
            return mebibyteValue / 1099511627776L;
        }

        @Override
        public double fromGibibytes(final double gibibyteValue) {
            return gibibyteValue / 1073741824L;
        }

        @Override
        public double fromTebibytes(final double tebibyteValue) {
            return tebibyteValue / 1048576L;
        }

        @Override
        public double fromPebibytes(final double pebibyteValue) {
            return pebibyteValue / 1024L;
        }

        @Override
        public double fromExbibytes(final double exbibyteValue) {
            return exbibyteValue / 1L;
        }
    },

    KIBIBYTE {
        @Override
        public String symbol() {
            return "KiB";
        }

        @Override
        public String displayName() {
            return "kibibyte";
        }

        @Override
        public int pow() {
            return 1;
        }

        @Override
        public int powOf() {
            return 1024;
        }

        @Override
        public String format(final double value) {
            return DigitalUnit.format(value, KIBIBYTE, false);
        }

        @Override
        public double toBytes(final double kibibyteValue) {
            return kibibyteValue * 1000L;
        }

        @Override
        public double toKilobytes(final double kibibyteValue) {
            return kibibyteValue * 1L;
        }

        @Override
        public double toMegabytes(final double kibibyteValue) {
            return kibibyteValue / 1000L;
        }

        @Override
        public double toGigabytes(final double kibibyteValue) {
            return kibibyteValue / 1000000L;
        }

        @Override
        public double toTerabytes(final double kibibyteValue) {
            return kibibyteValue / 1000000000L;
        }

        @Override
        public double toPetabytes(final double kibibyteValue) {
            return kibibyteValue / 1000000000000L;
        }

        @Override
        public double toExabytes(final double kibibyteValue) {
            return kibibyteValue / 1000000000000000L;
        }

        @Override
        public double toKibibytes(final double kibibyteValue) {
            return kibibyteValue;
        }

        @Override
        public double toMebibytes(final double kibibyteValue) {
            return kibibyteValue / 1024L;
        }

        @Override
        public double toGibibytes(final double kibibyteValue) {
            return kibibyteValue / 1048576L;
        }

        @Override
        public double toTebibytes(final double kibibyteValue) {
            return kibibyteValue / 1073741824L;
        }

        @Override
        public double toPebibytes(final double kibibyteValue) {
            return kibibyteValue / 1099511627776L;
        }

        @Override
        public double toExbibytes(final double kibibyteValue) {
            return kibibyteValue / 1125899906842624L;
        }

        @Override
        public double fromBytes(final double byteValue) {
            return byteValue / 1000L;
        }

        @Override
        public double fromKilobytes(final double kilobyteValue) {
            return kilobyteValue / 1L;
        }

        @Override
        public double fromMegabytes(final double megabyteValue) {
            return megabyteValue * 1000L;
        }

        @Override
        public double fromGigabytes(final double gigabyteValue) {
            return gigabyteValue * 1000000L;
        }

        @Override
        public double fromTerabytes(final double terabyteValue) {
            return terabyteValue * 1000000000L;
        }

        @Override
        public double fromPetabytes(final double petabyteValue) {
            return petabyteValue * 1000000000000L;
        }

        @Override
        public double fromExabytes(final double exabyteValue) {
            return exabyteValue * 1000000000000000L;
        }

        @Override
        public double fromKibibytes(final double kibibyteValue) {
            return kibibyteValue;
        }

        @Override
        public double fromMebibytes(final double mebibyteValue) {
            return mebibyteValue * 1024L;
        }

        @Override
        public double fromGibibytes(final double gibibyteValue) {
            return gibibyteValue * 1048576L;
        }

        @Override
        public double fromTebibytes(final double tebibyteValue) {
            return tebibyteValue * 1073741824L;
        }

        @Override
        public double fromPebibytes(final double pebibyteValue) {
            return pebibyteValue * 1099511627776L;
        }

        @Override
        public double fromExbibytes(final double exbibyteValue) {
            return exbibyteValue * 1125899906842624L;
        }
    },

    MEBIBYTE {
        @Override
        public String symbol() {
            return "MiB";
        }

        @Override
        public String displayName() {
            return "mebibyte";
        }

        @Override
        public int pow() {
            return 2;
        }

        @Override
        public int powOf() {
            return 1024;
        }

        @Override
        public String format(final double value) {
            return DigitalUnit.format(value, MEBIBYTE, false);
        }

        @Override
        public double toBytes(final double mebibyteValue) {
            return mebibyteValue * 1000000L;
        }

        @Override
        public double toKilobytes(final double mebibyteValue) {
            return mebibyteValue * 1000L;
        }

        @Override
        public double toMegabytes(final double mebibyteValue) {
            return mebibyteValue * 1L;
        }

        @Override
        public double toGigabytes(final double mebibyteValue) {
            return mebibyteValue / 1000L;
        }

        @Override
        public double toTerabytes(final double mebibyteValue) {
            return mebibyteValue / 1000000L;
        }

        @Override
        public double toPetabytes(final double mebibyteValue) {
            return mebibyteValue / 1000000000L;
        }

        @Override
        public double toExabytes(final double mebibyteValue) {
            return mebibyteValue / 1000000000000L;
        }

        @Override
        public double toKibibytes(final double mebibyteValue) {
            return mebibyteValue * 1024L;
        }

        @Override
        public double toMebibytes(final double mebibyteValue) {
            return mebibyteValue;
        }

        @Override
        public double toGibibytes(final double mebibyteValue) {
            return mebibyteValue / 1024L;
        }

        @Override
        public double toTebibytes(final double mebibyteValue) {
            return mebibyteValue / 1048576L;
        }

        @Override
        public double toPebibytes(final double mebibyteValue) {
            return mebibyteValue / 1073741824L;
        }

        @Override
        public double toExbibytes(final double mebibyteValue) {
            return mebibyteValue / 1099511627776L;
        }

        @Override
        public double fromBytes(final double byteValue) {
            return byteValue / 1000000L;
        }

        @Override
        public double fromKilobytes(final double kilobyteValue) {
            return kilobyteValue / 1000L;
        }

        @Override
        public double fromMegabytes(final double megabyteValue) {
            return megabyteValue / 1L;
        }

        @Override
        public double fromGigabytes(final double gigabyteValue) {
            return gigabyteValue * 1000L;
        }

        @Override
        public double fromTerabytes(final double terabyteValue) {
            return terabyteValue * 1000000L;
        }

        @Override
        public double fromPetabytes(final double petabyteValue) {
            return petabyteValue * 1000000000L;
        }

        @Override
        public double fromExabytes(final double exabyteValue) {
            return exabyteValue * 1000000000000L;
        }

        @Override
        public double fromKibibytes(final double kibibyteValue) {
            return kibibyteValue / 1024L;
        }

        @Override
        public double fromMebibytes(final double mebibyteValue) {
            return mebibyteValue;
        }

        @Override
        public double fromGibibytes(final double gibibyteValue) {
            return gibibyteValue * 1024L;
        }

        @Override
        public double fromTebibytes(final double tebibyteValue) {
            return tebibyteValue * 1048576L;
        }

        @Override
        public double fromPebibytes(final double pebibyteValue) {
            return pebibyteValue * 1073741824L;
        }

        @Override
        public double fromExbibytes(final double exbibyteValue) {
            return exbibyteValue * 1099511627776L;
        }
    },

    GIBIBYTE {
        @Override
        public String symbol() {
            return "GiB";
        }

        @Override
        public String displayName() {
            return "gibibyte";
        }

        @Override
        public int pow() {
            return 3;
        }

        @Override
        public int powOf() {
            return 1024;
        }

        @Override
        public String format(final double value) {
            return DigitalUnit.format(value, GIBIBYTE, false);
        }

        @Override
        public double toBytes(final double gibibyteValue) {
            return gibibyteValue * 1000000000L;
        }

        @Override
        public double toKilobytes(final double gibibyteValue) {
            return gibibyteValue * 1000000L;
        }

        @Override
        public double toMegabytes(final double gibibyteValue) {
            return gibibyteValue * 1000L;
        }

        @Override
        public double toGigabytes(final double gibibyteValue) {
            return gibibyteValue * 1L;
        }

        @Override
        public double toTerabytes(final double gibibyteValue) {
            return gibibyteValue / 1000L;
        }

        @Override
        public double toPetabytes(final double gibibyteValue) {
            return gibibyteValue / 1000000L;
        }

        @Override
        public double toExabytes(final double gibibyteValue) {
            return gibibyteValue / 1000000000L;
        }

        @Override
        public double toKibibytes(final double gibibyteValue) {
            return gibibyteValue * 1048576L;
        }

        @Override
        public double toMebibytes(final double gibibyteValue) {
            return gibibyteValue * 1024L;
        }

        @Override
        public double toGibibytes(final double gibibyteValue) {
            return gibibyteValue;
        }

        @Override
        public double toTebibytes(final double gibibyteValue) {
            return gibibyteValue / 1024L;
        }

        @Override
        public double toPebibytes(final double gibibyteValue) {
            return gibibyteValue / 1048576L;
        }

        @Override
        public double toExbibytes(final double gibibyteValue) {
            return gibibyteValue / 1073741824L;
        }

        @Override
        public double fromBytes(final double byteValue) {
            return byteValue / 1000000000L;
        }

        @Override
        public double fromKilobytes(final double kilobyteValue) {
            return kilobyteValue / 1000000L;
        }

        @Override
        public double fromMegabytes(final double megabyteValue) {
            return megabyteValue / 1000L;
        }

        @Override
        public double fromGigabytes(final double gigabyteValue) {
            return gigabyteValue / 1L;
        }

        @Override
        public double fromTerabytes(final double terabyteValue) {
            return terabyteValue * 1000L;
        }

        @Override
        public double fromPetabytes(final double petabyteValue) {
            return petabyteValue * 1000000L;
        }

        @Override
        public double fromExabytes(final double exabyteValue) {
            return exabyteValue * 1000000000L;
        }

        @Override
        public double fromKibibytes(final double kibibyteValue) {
            return kibibyteValue / 1048576L;
        }

        @Override
        public double fromMebibytes(final double mebibyteValue) {
            return mebibyteValue / 1024L;
        }

        @Override
        public double fromGibibytes(final double gibibyteValue) {
            return gibibyteValue;
        }

        @Override
        public double fromTebibytes(final double tebibyteValue) {
            return tebibyteValue * 1024L;
        }

        @Override
        public double fromPebibytes(final double pebibyteValue) {
            return pebibyteValue * 1048576L;
        }

        @Override
        public double fromExbibytes(final double exbibyteValue) {
            return exbibyteValue * 1073741824L;
        }
    },

    TEBIBYTE {
        @Override
        public String symbol() {
            return "TiB";
        }

        @Override
        public String displayName() {
            return "tebibyte";
        }

        @Override
        public int pow() {
            return 4;
        }

        @Override
        public int powOf() {
            return 1024;
        }

        @Override
        public String format(final double value) {
            return DigitalUnit.format(value, TEBIBYTE, false);
        }

        @Override
        public double toBytes(final double tebibyteValue) {
            return tebibyteValue * 1000000000000L;
        }

        @Override
        public double toKilobytes(final double tebibyteValue) {
            return tebibyteValue * 1000000000L;
        }

        @Override
        public double toMegabytes(final double tebibyteValue) {
            return tebibyteValue * 1000000L;
        }

        @Override
        public double toGigabytes(final double tebibyteValue) {
            return tebibyteValue * 1000L;
        }

        @Override
        public double toTerabytes(final double tebibyteValue) {
            return tebibyteValue * 1L;
        }

        @Override
        public double toPetabytes(final double tebibyteValue) {
            return tebibyteValue / 1000L;
        }

        @Override
        public double toExabytes(final double tebibyteValue) {
            return tebibyteValue / 1000000L;
        }

        @Override
        public double toKibibytes(final double tebibyteValue) {
            return tebibyteValue * 1073741824L;
        }

        @Override
        public double toMebibytes(final double tebibyteValue) {
            return tebibyteValue * 1048576L;
        }

        @Override
        public double toGibibytes(final double tebibyteValue) {
            return tebibyteValue * 1024L;
        }

        @Override
        public double toTebibytes(final double tebibyteValue) {
            return tebibyteValue;
        }

        @Override
        public double toPebibytes(final double tebibyteValue) {
            return tebibyteValue / 1024L;
        }

        @Override
        public double toExbibytes(final double tebibyteValue) {
            return tebibyteValue / 1048576L;
        }

        @Override
        public double fromBytes(final double byteValue) {
            return byteValue / 1000000000000L;
        }

        @Override
        public double fromKilobytes(final double kilobyteValue) {
            return kilobyteValue / 1000000000L;
        }

        @Override
        public double fromMegabytes(final double megabyteValue) {
            return megabyteValue / 1000000L;
        }

        @Override
        public double fromGigabytes(final double gigabyteValue) {
            return gigabyteValue / 1000L;
        }

        @Override
        public double fromTerabytes(final double terabyteValue) {
            return terabyteValue / 1L;
        }

        @Override
        public double fromPetabytes(final double petabyteValue) {
            return petabyteValue * 1000L;
        }

        @Override
        public double fromExabytes(final double exabyteValue) {
            return exabyteValue * 1000000L;
        }

        @Override
        public double fromKibibytes(final double kibibyteValue) {
            return kibibyteValue / 1073741824L;
        }

        @Override
        public double fromMebibytes(final double mebibyteValue) {
            return mebibyteValue / 1048576L;
        }

        @Override
        public double fromGibibytes(final double gibibyteValue) {
            return gibibyteValue / 1024L;
        }

        @Override
        public double fromTebibytes(final double tebibyteValue) {
            return tebibyteValue;
        }

        @Override
        public double fromPebibytes(final double pebibyteValue) {
            return pebibyteValue * 1024L;
        }

        @Override
        public double fromExbibytes(final double exbibyteValue) {
            return exbibyteValue * 1048576L;
        }
    },

    PEBIBYTE {
        @Override
        public String symbol() {
            return "PiB";
        }

        @Override
        public String displayName() {
            return "pebibyte";
        }

        @Override
        public int pow() {
            return 5;
        }

        @Override
        public int powOf() {
            return 1024;
        }

        @Override
        public String format(final double value) {
            return DigitalUnit.format(value, PEBIBYTE, false);
        }

        @Override
        public double toBytes(final double pebibyteValue) {
            return pebibyteValue * 1000000000000000L;
        }

        @Override
        public double toKilobytes(final double pebibyteValue) {
            return pebibyteValue * 1000000000000L;
        }

        @Override
        public double toMegabytes(final double pebibyteValue) {
            return pebibyteValue * 1000000000L;
        }

        @Override
        public double toGigabytes(final double pebibyteValue) {
            return pebibyteValue * 1000000L;
        }

        @Override
        public double toTerabytes(final double pebibyteValue) {
            return pebibyteValue * 1000L;
        }

        @Override
        public double toPetabytes(final double pebibyteValue) {
            return pebibyteValue * 1L;
        }

        @Override
        public double toExabytes(final double pebibyteValue) {
            return pebibyteValue / 1000L;
        }

        @Override
        public double toKibibytes(final double pebibyteValue) {
            return pebibyteValue * 1099511627776L;
        }

        @Override
        public double toMebibytes(final double pebibyteValue) {
            return pebibyteValue * 1073741824L;
        }

        @Override
        public double toGibibytes(final double pebibyteValue) {
            return pebibyteValue * 1048576L;
        }

        @Override
        public double toTebibytes(final double pebibyteValue) {
            return pebibyteValue * 1024L;
        }

        @Override
        public double toPebibytes(final double pebibyteValue) {
            return pebibyteValue;
        }

        @Override
        public double toExbibytes(final double pebibyteValue) {
            return pebibyteValue / 1024L;
        }

        @Override
        public double fromBytes(final double byteValue) {
            return byteValue / 1000000000000000L;
        }

        @Override
        public double fromKilobytes(final double kilobyteValue) {
            return kilobyteValue / 1000000000000L;
        }

        @Override
        public double fromMegabytes(final double megabyteValue) {
            return megabyteValue / 1000000000L;
        }

        @Override
        public double fromGigabytes(final double gigabyteValue) {
            return gigabyteValue / 1000000L;
        }

        @Override
        public double fromTerabytes(final double terabyteValue) {
            return terabyteValue / 1000L;
        }

        @Override
        public double fromPetabytes(final double petabyteValue) {
            return petabyteValue / 1L;
        }

        @Override
        public double fromExabytes(final double exabyteValue) {
            return exabyteValue * 1000L;
        }

        @Override
        public double fromKibibytes(final double kibibyteValue) {
            return kibibyteValue / 1099511627776L;
        }

        @Override
        public double fromMebibytes(final double mebibyteValue) {
            return mebibyteValue / 1073741824L;
        }

        @Override
        public double fromGibibytes(final double gibibyteValue) {
            return gibibyteValue / 1048576L;
        }

        @Override
        public double fromTebibytes(final double tebibyteValue) {
            return tebibyteValue / 1024L;
        }

        @Override
        public double fromPebibytes(final double pebibyteValue) {
            return pebibyteValue;
        }

        @Override
        public double fromExbibytes(final double exbibyteValue) {
            return exbibyteValue * 1024L;
        }
    },

    EXBIBYTE {
        @Override
        public String symbol() {
            return "EiB";
        }

        @Override
        public String displayName() {
            return "exbibyte";
        }

        @Override
        public int pow() {
            return 6;
        }

        @Override
        public int powOf() {
            return 1024;
        }

        @Override
        public String format(final double value) {
            return DigitalUnit.format(value, EXBIBYTE, false);
        }

        @Override
        public double toBytes(final double exbibyteValue) {
            return exbibyteValue * 1000000000000000000L;
        }

        @Override
        public double toKilobytes(final double exbibyteValue) {
            return exbibyteValue * 1000000000000000L;
        }

        @Override
        public double toMegabytes(final double exbibyteValue) {
            return exbibyteValue * 1000000000000L;
        }

        @Override
        public double toGigabytes(final double exbibyteValue) {
            return exbibyteValue * 1000000000L;
        }

        @Override
        public double toTerabytes(final double exbibyteValue) {
            return exbibyteValue * 1000000L;
        }

        @Override
        public double toPetabytes(final double exbibyteValue) {
            return exbibyteValue * 1000L;
        }

        @Override
        public double toExabytes(final double exbibyteValue) {
            return exbibyteValue * 1L;
        }

        @Override
        public double toKibibytes(final double exbibyteValue) {
            return exbibyteValue * 1125899906842624L;
        }

        @Override
        public double toMebibytes(final double exbibyteValue) {
            return exbibyteValue * 1099511627776L;
        }

        @Override
        public double toGibibytes(final double exbibyteValue) {
            return exbibyteValue * 1073741824L;
        }

        @Override
        public double toTebibytes(final double exbibyteValue) {
            return exbibyteValue * 1048576L;
        }

        @Override
        public double toPebibytes(final double exbibyteValue) {
            return exbibyteValue * 1024L;
        }

        @Override
        public double toExbibytes(final double exbibyteValue) {
            return exbibyteValue;
        }

        @Override
        public double fromBytes(final double byteValue) {
            return byteValue / 1000000000000000000L;
        }

        @Override
        public double fromKilobytes(final double kilobyteValue) {
            return kilobyteValue / 1000000000000000L;
        }

        @Override
        public double fromMegabytes(final double megabyteValue) {
            return megabyteValue / 1000000000000L;
        }

        @Override
        public double fromGigabytes(final double gigabyteValue) {
            return gigabyteValue / 1000000000L;
        }

        @Override
        public double fromTerabytes(final double terabyteValue) {
            return terabyteValue / 1000000L;
        }

        @Override
        public double fromPetabytes(final double petabyteValue) {
            return petabyteValue / 1000L;
        }

        @Override
        public double fromExabytes(final double exabyteValue) {
            return exabyteValue / 1L;
        }

        @Override
        public double fromKibibytes(final double kibibyteValue) {
            return kibibyteValue / 1125899906842624L;
        }

        @Override
        public double fromMebibytes(final double mebibyteValue) {
            return mebibyteValue / 1099511627776L;
        }

        @Override
        public double fromGibibytes(final double gibibyteValue) {
            return gibibyteValue / 1073741824L;
        }

        @Override
        public double fromTebibytes(final double tebibyteValue) {
            return tebibyteValue / 1048576L;
        }

        @Override
        public double fromPebibytes(final double pebibyteValue) {
            return pebibyteValue / 1024L;
        }

        @Override
        public double fromExbibytes(final double exbibyteValue) {
            return exbibyteValue;
        }
    };

    public abstract String symbol();

    public abstract String displayName();

    public abstract int pow();

    public abstract int powOf();

    public abstract String format(final double value);

    public abstract double toBytes(final double value);

    public abstract double toKilobytes(final double value);

    public abstract double toMegabytes(final double value);

    public abstract double toGigabytes(final double value);

    public abstract double toTerabytes(final double value);

    public abstract double toPetabytes(final double value);

    public abstract double toExabytes(final double value);

    public abstract double toKibibytes(final double value);

    public abstract double toMebibytes(final double value);

    public abstract double toGibibytes(final double value);

    public abstract double toTebibytes(final double value);

    public abstract double toPebibytes(final double value);

    public abstract double toExbibytes(final double value);

    public abstract double fromBytes(final double value);

    public abstract double fromKilobytes(final double value);

    public abstract double fromMegabytes(final double value);

    public abstract double fromGigabytes(final double value);

    public abstract double fromTerabytes(final double value);

    public abstract double fromPetabytes(final double value);

    public abstract double fromExabytes(final double value);

    public abstract double fromKibibytes(final double value);

    public abstract double fromMebibytes(final double value);

    public abstract double fromGibibytes(final double value);

    public abstract double fromTebibytes(final double value);

    public abstract double fromPebibytes(final double value);

    public abstract double fromExbibytes(final double value);

    public static final String[] SI_PREFIXES = new String[]{
        KILOBYTE.symbol(),
        MEGABYTE.symbol(),
        GIGABYTE.symbol(),
        TERABYTE.symbol(),
        PETABYTE.symbol(),
        EXABYTE.symbol(),
    };

    public static final String[] IEC_PREFIXES = new String[]{
        KIBIBYTE.symbol(),
        MEBIBYTE.symbol(),
        GIBIBYTE.symbol(),
        TEBIBYTE.symbol(),
        PEBIBYTE.symbol(),
        EXBIBYTE.symbol()
    };

    public static String format(final double value, final DigitalUnit unit, boolean useSi) {
        final double bytes = unit.toBytes(value);
        final int base = useSi ? 1000 : 1024;

        if (bytes < base) {
            return bytes + " " + BYTE.symbol();
        }

        final int exp = (int) (Math.log(bytes) / Math.log(base));

        if (exp < 0 || exp > 5) { // ??? what???
            return bytes + " " + BYTE.symbol();
        }

        return String.format(
            "%.2f %s",
            bytes / Math.pow(base, exp),
            useSi ? SI_PREFIXES[exp - 1] : IEC_PREFIXES[exp - 1]
        );
    }
}
