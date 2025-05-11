Feature: VocaGame Register
 

  @VocaGameRegister1
  Scenario: Test Register when all inputs are empty on VocaGame Register Page
     Given User is on Register Page of VocaGame
     When User clicks button "Daftar Sekarang" on Register Page of VocaGame1
     Then the validation messages appears on Register Page of VocaGame1
      |Nama Depan tidak boleh kosong!|
      |Nama Belakang tidak boleh kosong!|
      |Nomor WhatsApp tidak boleh kosong!|
      |Password tidak boleh kosong!|
      |Konfirmasi Password tidak boleh kosong!|


   @VocaGameRegister2
  Scenario: Test Register when the phone number is already registered 
     Given User is on Register Page of VocaGame
     When User inputs the following on Register Page of VocaGame
     |Jonathan|
     |Regan|
     |82111152597|
     |abcdef58|
     |abcdef58|
     And User clicks "Daftar Sekarang" button on Register Page of VocaGame2
     Then the validation messages appears on Register Page of VocaGame2
      |Phone number is already registered. Please use a different phone number.|


    @VocaGameRegister3
  Scenario: Test Register when the confirmation password does not match with the password
     Given User is on Register Page of VocaGame
     When User inputs the following on Register Page of VocaGame
     |Jonathan|
     |Regan|
     |82111152597|
     |abcdef58|
     |abcdef59|
     Then the validation messages appears on Register Page of VocaGame3
      |Password dan Konfirmasi Password tidak sesuai|
     And "Daftar Sekarang" button on Register Page of VocaGame is disabled