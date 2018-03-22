/*
 * Copyright (c) 2013 Cosmin Stejerean, Karl Heinz Marbaise, and contributors.
 *
 * Distributed under the MIT license: http://opensource.org/licenses/MIT
 */

package com.offbytwo.jenkins.model;

import com.offbytwo.jenkins.client.JenkinsHttpConnection;

/**
 * The base model.
 */
public class BaseModel {

    /**
     * The class.
     */
    private String _class;
    
    
    /**
     * Get the class.
     * @return class
     */
    public String get_class() {
        return _class;
    }

    //TODO: We should make this private
    protected JenkinsHttpConnection client;

    
    /**
     * Get the HTTP client.
     * @return client
     */
    public JenkinsHttpConnection getClient() {
        return client;
    }

    /**
     * Set the HTTP client.
     * @param client 
     */
    public void setClient(final JenkinsHttpConnection client) {
        this.client = client;
    }
}
