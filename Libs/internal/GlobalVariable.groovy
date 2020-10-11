package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object usernameDev
     
    /**
     * <p></p>
     */
    public static Object passDev
     
    /**
     * <p></p>
     */
    public static Object userDev_fail
     
    /**
     * <p></p>
     */
    public static Object passDevfail
     
    /**
     * <p></p>
     */
    public static Object usernameQA
     
    /**
     * <p></p>
     */
    public static Object passQA
     
    /**
     * <p></p>
     */
    public static Object userQA_fail
     
    /**
     * <p></p>
     */
    public static Object passQA_fail
     
    /**
     * <p></p>
     */
    public static Object usernameUAT
     
    /**
     * <p></p>
     */
    public static Object passUAT
     
    /**
     * <p></p>
     */
    public static Object userUAT_fail
     
    /**
     * <p></p>
     */
    public static Object passUAT_fail
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            url = selectedVariables['url']
            usernameDev = selectedVariables['usernameDev']
            passDev = selectedVariables['passDev']
            userDev_fail = selectedVariables['userDev_fail']
            passDevfail = selectedVariables['passDevfail']
            usernameQA = selectedVariables['usernameQA']
            passQA = selectedVariables['passQA']
            userQA_fail = selectedVariables['userQA_fail']
            passQA_fail = selectedVariables['passQA_fail']
            usernameUAT = selectedVariables['usernameUAT']
            passUAT = selectedVariables['passUAT']
            userUAT_fail = selectedVariables['userUAT_fail']
            passUAT_fail = selectedVariables['passUAT_fail']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
