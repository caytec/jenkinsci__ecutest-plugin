/*
 * Copyright (c) 2015 TraceTronic GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *   1. Redistributions of source code must retain the above copyright notice, this
 *      list of conditions and the following disclaimer.
 *
 *   2. Redistributions in binary form must reproduce the above copyright notice, this
 *      list of conditions and the following disclaimer in the documentation and/or
 *      other materials provided with the distribution.
 *
 *   3. Neither the name of TraceTronic GmbH nor the names of its
 *      contributors may be used to endorse or promote products derived from
 *      this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package de.tracetronic.jenkins.plugins.ecutest.wrapper.com.api;

import java.util.List;

import de.tracetronic.jenkins.plugins.ecutest.test.client.AbstractTestClient.CheckInfoHolder;
import de.tracetronic.jenkins.plugins.ecutest.wrapper.com.ETComException;

/**
 * Represents the ECU-TEST specific COMPackage API.
 *
 * @author Christian Pönisch <christian.poenisch@tracetronic.de>
 */
public interface ComProject {

    /**
     * Queries the package name.
     *
     * @return the name of this package
     * @throws ETComException
     *             in case of a COM exception
     */
    String getName() throws ETComException;

    /**
     * Queries the list of packages used in this project.
     *
     * @return the list of referenced packages
     * @throws ETComException
     *             in case of a COM exception
     */
    String getPackages() throws ETComException;

    /**
     * Returns a list of the errors of the project.
     * Every list element is a tuple containing:
     * <ul>
     * <li>file path</li>
     * <li>seriousness (Error, Warning, Note)</li>
     * <li>error message</li>
     * <li>line number</li>
     * </ul>
     *
     * @return the error list
     * @throws ETComException
     *             in case of a COM exception
     */
    List<CheckInfoHolder> check() throws ETComException;

}
