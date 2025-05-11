Feature: VocaGame Login
 

  @VocaGameLogin1
  Scenario: Test Login when the nomor whatsapp textbox and password textbox are both empty on VocaGame Login Page
     Given User is on Login Page of VocaGame
When User clicks button "Masuk Sekarang" on Login Page of VocaGame
Then the validation messages appears on Login Page of VocaGame1
      |Nomor WhatsApp tidak boleh kosong!|
      |Password tidak boleh kosong!|
     
   @VocaGameLogin2
  Scenario: Test Login when correct whatsapp number but wrong password on VocaGame Login Page
     Given User is on Login Page of VocaGame
     When User puts the following on Login Page of VocaGame
     |123456789|
     |abcdef58|
     Then the validation messages appears on Login Page of VocaGame2
     |Wrong password. Verify and try again.|


    @VocaGameLogin3
  Scenario: Test Login when whatsapp number is not registered on VocaGame Login Page
     Given User is on Login Page of VocaGame
     When User puts the following on Login Page of VocaGame
     |89755579262|
     |abcdef58|
     Then the validation messages appears on Login Page of VocaGame3
     |Phone number not found. Please use a valid, registered number.|