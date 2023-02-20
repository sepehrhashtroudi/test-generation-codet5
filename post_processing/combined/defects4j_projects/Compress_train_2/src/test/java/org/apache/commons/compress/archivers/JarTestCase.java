/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.compress.archivers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.utils.IOUtils;

import org.apache.commons.compress.AbstractTestCase;

public final class JarTestCase extends AbstractTestCase {

public void testJarUnarchive16() throws Exception { 
     final File input = getFile("bla.jar"); 
     final InputStream is = new FileInputStream(input); 
     final ArchiveInputStream in = new ArchiveStreamFactory().createArchiveInputStream("jar", is); 
     ZipArchiveEntry entry = (ZipArchiveEntry) in.getNextEntry(); 
     File o = new File(dir, entry.getName()); 
     o.getParentFile().mkdirs(); 
     OutputStream out = new FileOutputStream(o); 
     IOUtils.copy(in, out); 
     out.close(); 
     entry = (ZipArchiveEntry) in.getNextEntry(); 
     o = new File(dir, entry.getName()); 
     o.getParentFile().mkdirs(); 
     out = new FileOutputStream(o); 
     IOUtils.copy(in, out); 
     out.close(); 
     entry = (ZipArchiveEntry) in.getNextEntry(); 
     o = new File(dir, entry.getName()); 
     o.getParentFile().mkdirs(); 
     out = new FileOutputStream(o); 
     IOUtils.copy(in, out); 
     out.close(); 
     in.close(); 
 } 

	

	
	
	
	

}
