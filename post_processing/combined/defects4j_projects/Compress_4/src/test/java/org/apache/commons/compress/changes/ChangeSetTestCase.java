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
package org.apache.commons.compress.changes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.compress.AbstractTestCase;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

/**
 * Checks several ChangeSet business logics.
 */
public final class ChangeSetTestCase extends AbstractTestCase {
    /**
     * Tries to delete the folder "bla" from a zip file. This should result in
     * the deletion of bla/*, which actually means bla/test4.xml should be
     * removed from this zipfile. The file something/bla (without ending, named
     * like the folder) should not be deleted.
     * 
     * @throws Exception
     */
    

    /**
     * Tries to delete the file "bla/test5.xml" from a zip file. This should
     * result in the deletion of "bla/test5.xml".
     * 
     * @throws Exception
     */
    

    /**
     * Tries to delete a directory with a file and adds a new directory with a
     * new file and with the same name. Should delete dir1/* and add
     * dir1/test.txt at the end
     * 
     * @throws Exception
     */
    

    /**
     * Adds a file to a zip archive. Deletes an other file.
     * 
     * @throws Exception
     */
    

    /**
     * add blub/test.txt + delete blub Should add dir1/test.txt and delete it
     * afterwards. In this example, the zip archive should stay untouched.
     * 
     * @throws Exception
     */
    

    /**
     * delete bla + add bla/test.txt + delete bla Deletes dir1/* first, then
     * surpresses the add of bla.txt cause there is a delete operation later.
     * 
     * @throws Exception
     */
    

    /**
     * Simple Delete from a zip file.
     * 
     * @throws Exception
     */
    

    /**
     * Simple delete from a tar file
     * 
     * @throws Exception
     */
    

    /**
     * Simple delete from a jar file
     * 
     * @throws Exception
     */
    

    

    /**
     * Delete from a jar file and add another file
     * 
     * @throws Exception
     */
    

    /**
     * Simple delete from an ar file
     * 
     * @throws Exception
     */
    

    /**
     * Deletes a file from an AR-archive and adds another
     * 
     * @throws Exception
     */
    

    /**
     * TODO: Move operations are not supported currently
     * 
     * mv dir1/test.text dir2/test.txt + delete dir1 Moves the file to dir2 and
     * deletes everything in dir1
     * 
     * @throws Exception
     */
    

    /**
     * TODO: Move operations are not supported currently
     * 
     * add dir1/bla.txt + mv dir1/test.text dir2/test.txt + delete dir1
     * 
     * Add dir1/bla.txt should be surpressed. All other dir1 files will be
     * deleted, except dir1/test.text will be moved
     * 
     * @throws Exception
     */
    
}
