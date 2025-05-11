$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/VocaGameForgetPasswordandResetPassword.feature");
formatter.feature({
  "name": "VocaGame Forget Password and Reset Password",
  "description": " \n ",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test Forget Password when the nomor whatsapp textbox is empty on VocaGame Forget Password Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@VocaGameForgetPassword1"
    }
  ]
});
formatter.step({
  "name": "User is on Forget Password Page of VocaGame",
  "keyword": "Given "
});
formatter.match({
  "location": "ForgetPasswordandResetPassword.user_is_on_forget_password_page_of_voca_game()"
});
