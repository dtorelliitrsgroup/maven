package org.apache.maven.toolchain;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.execution.MavenSession;


/**
 * Component for use by the <code>maven-toolchains-plugin</code> only.
 *
 * @author mkleint
 * @since 2.0.9
 */
public interface ToolchainManagerPrivate
{

    /**
     * Retrieves the toolchains of given type from the user settings.
     *
     * @since 3.0 (addition of the <code>MavenSession</code> parameter)
     */
    ToolchainPrivate[] getToolchainsForType( String type, MavenSession context )
        throws MisconfiguredToolchainException;

    /**
     * Stores the toolchain into build context.
     *
     * @since 2.0.9
     */
    void storeToolchainToBuildContext( ToolchainPrivate toolchain, MavenSession context );

}
