package com.example.testingweb;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({TestCase1.class, TestCase2.class})
@ExcludeTags("smoke")
//@SelectPackages({})
//@IncludePackages("sample1")
//@ExcludePackages("sample2")
public class TestSuiteEx {

}
