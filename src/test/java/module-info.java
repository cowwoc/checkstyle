/**
 * Checkstyle test module providing test infrastructure.
 *
 * @since 11.0.2
 */
module com.puppycrawl.tools.checkstyle.test {
    requires com.puppycrawl.tools.checkstyle;
    requires java.xml;
    requires java.desktop;
    requires java.logging;

    // Test dependencies
    requires org.junit.jupiter.api;
    requires com.google.common;
    requires truth;
    requires info.picocli;
    requires org.apache.commons.beanutils;

    exports com.puppycrawl.tools.checkstyle.test;
    exports com.puppycrawl.tools.checkstyle.test.api;
    exports com.puppycrawl.tools.checkstyle.test.filters;
    exports com.puppycrawl.tools.checkstyle.test.utils;
    exports com.puppycrawl.tools.checkstyle.test.checks;
    exports com.puppycrawl.tools.checkstyle.test.ant;
    exports com.puppycrawl.tools.checkstyle.test.bdd;
    exports com.puppycrawl.tools.checkstyle.test.gui;
    exports com.puppycrawl.tools.checkstyle.test.meta;
    exports com.puppycrawl.tools.checkstyle.test.xpath;
    exports com.puppycrawl.tools.checkstyle.test.filefilters;
    exports com.puppycrawl.tools.checkstyle.test.grammar;
}