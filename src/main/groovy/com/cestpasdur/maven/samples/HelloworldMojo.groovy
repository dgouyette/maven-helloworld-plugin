package com.cestpasdur.maven.samples

import org.codehaus.groovy.maven.mojo.GroovyMojo



/**
 * description
 *
 *@goal hello
 */
class HelloworldMojo extends GroovyMojo{

    /**
     * Dit bonjour ˆ l'utilisateur 
     *
     */
    void execute(){
        log.info("hello world")
    }
}