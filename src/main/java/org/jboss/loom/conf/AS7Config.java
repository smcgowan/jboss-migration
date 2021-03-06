package org.jboss.loom.conf;

import java.io.File;

/**
 * AS 7 configuration.
 *
 * @author Ondrej Zizka, ozizka at redhat.com
 */
public class AS7Config {
    
    private String as7dir;
    private String as7configPath = "standalone/configuration/standalone.xml";
    private String modulesDir = null;
    private String configDir = "standalone/configuration";
    
    private String host = "localhost";
    private int mgmtPort = 9999;


    public String getConfigFilePath() {
        return new File(getDir(), getConfigPath()).getPath();  // TODO: Return File and use that.
    }

    public String getConfigDir(){
        return new File(getDir(), configDir).getPath();
    }

    public File getModulesDir() {
        String modulesSubPath;
        if( modulesDir != null )
            modulesSubPath = modulesDir;
        else
            modulesSubPath = isVersionLaterThan("7.2.0") ? "modules" : "modules/system/layers/base";
        
        return new File(this.getDir(), modulesSubPath);
    }
    


    //<editor-fold defaultstate="collapsed" desc="get/set">
    public String getDir() { return as7dir; }
    public void setDir(String dirAS7) { this.as7dir = dirAS7; }
    public String getConfigPath() { return as7configPath; }
    public void setConfigPath(String confPathAS7) { this.as7configPath = confPathAS7; }
    public String getHost() { return host; }
    public void setHost( String host ) { this.host = host; }
    public int getManagementPort() { return mgmtPort; }
    public void setManagementPort( int port ) { this.mgmtPort = port; }


    //</editor-fold>



    private boolean isVersionLaterThan( String string ) {
        return true;
    }
    
}// class
