package Testcases;


import org.testng.annotations.Test;

import com.sevaki.BaseClass.Android_components;
import com.sevaki.pages.Already_Registred_MobileNumber;
import com.sevaki.pages.Empty_Fileds;
import com.sevaki.pages.NewUser_Registration;
import com.sevaki.pages.Valid_ReferalCode;

public class TC0001 extends Android_components{
	@Test
	public static void Run() throws Exception {
		
	
		Android_components.Opening_theAPP();
		NewUser_Registration.Newuser_registration_method();
		Already_Registred_MobileNumber.AlreadyRegistredMN();
		Empty_Fileds.clickon_Registernow_button();
		Valid_ReferalCode.referal();
		Android_components.ClosetheAPP();
	}

}
