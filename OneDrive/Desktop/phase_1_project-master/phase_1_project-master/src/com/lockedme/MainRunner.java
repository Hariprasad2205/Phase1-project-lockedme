/* ----------  */

package com.lockedme;

public class MainRunner {
    public static void main(String[] args) {

       
        FileOperations.createMainFolderIfNotPresent("main");
        MenuOptions.printWelcomeScreen("Locker pvt ltd", "Hariprasad ");
        HandleOptions.handleWelcomeScreenInput();
    }
}
