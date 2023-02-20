package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;

public class TestVersionUtil extends com.fasterxml.jackson.test.BaseTest
{

public void testPackageVersionMatches44() { 
     assertEquals(PackageVersion.VERSION, VersionUtil.versionFor(UTF8JsonGenerator.class)); 
 } 


public void testMavenVersionParsing72() { 
     assertEquals(new Version(1, 2, 3, "SNAPSHOT", "foo.bar", "foo-bar"), VersionUtil.mavenVersionFor(TestVersionUtil.class.getClassLoader(), "foo.bar", "foo-bar")); 
 } 

    

    

    

    
}
