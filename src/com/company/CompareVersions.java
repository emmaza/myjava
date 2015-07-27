package com.company;

/**
 * Created by emma on 9/7/15.
 */
public class CompareVersions {
    public static void main(String[] args) {
        String v1 = "0.1.1";
        String v2 = "1.0";
        String v3 = "1.2";
        String v4 = "1.2";
        int k = compareVersions(v1,v2);
        int k1 = compareVersions(v2,v1);
        int k0 = compareVersions(v3,v4);
        System.out.println(k);
        System.out.println(k1);
        System.out.println(k0);

    }

    public static int compareVersions(String version1, String version2){
        //Basically I split the string with regex "." (it was written "\." since "." only means any character),
        // then using looping, I tried to find out the value of the version using parseInt.
        // If one version has a lesser subversion than the others, it will be filled with zeros.
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");
        int longest = ver1.length > ver2.length ? ver1.length : ver2.length;
        for(int i=0; i<longest; i++){
            int v1 = i<ver1.length ? Integer.parseInt(ver1[i]) : 0;
            int v2 = i<ver2.length ? Integer.parseInt(ver2[i]) : 0;
            if(v1 > v2) return 1;
            if(v1 < v2) return -1;
        }
        return 0;
    }
}
