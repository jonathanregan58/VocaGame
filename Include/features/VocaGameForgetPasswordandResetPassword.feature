Feature: VocaGame Forget Password and Reset Password
 
 
@VocaGameForgetPassword1
  Scenario: Test Forget Password when the nomor whatsapp textbox is empty on VocaGame Forget Password Page
     Given User is on Forget Password Page of VocaGame
     When User clicks button "Kirim Kode OTP" on Forget Password Page of VocaGame
     Then the validation messages appears on Forget Password Page of VocaGame1
      |phoneNumber should not be empty|
      
@VocaGameForgetPassword2
  Scenario: Test Forget Password when the number on nomor whatsapp textbox on VocaGame Forget Password Page is not registered
    Given User is on Forget Password Page of VocaGame
    When User types "878555394" on Nomor WhatsApp textbox on Forget Password Page of VocaGame
    And User clicks button "Kirim Kode OTP" on Forget Password Page of VocaGame
    Then the validation messages appears on Forget Password Page of VocaGame2
    |Account not found, please check your phone number|
    
@VocaGameForgetPassword3
  Scenario: Test Forget Password when the number on nomor whatsapp textbox on VocaGame Forget Password Page is not registered
    Given User is on Forget Password Page of VocaGame
    When User types "82111152597" on Nomor WhatsApp textbox on Forget Password Page of VocaGame
    And User clicks button "Kirim Kode OTP" on Forget Password Page of VocaGame
   Then User is directed to Reset Password Page of VocaGame
   
@VocaGameResetPassword1
Scenario: Test Reset Password when the OTP is invalid
Given User is on Reset Password Page of VocaGame
When User types "777777"on kode OTP textbox on Reset Password Page of VocaGame
And User clicks button "Konfirmasi Kode OTP" on Reset Password Page of VocaGame
Then the validation messages appears on Reset Password Page of VocaGame
|The OTP you entered is invalid. Please double-check the OTP and try again.|