Feature: VocaGame Mobile Legends
 

  @VocaGameMobileLegends1
  Scenario: Test when access Mobile Legends on VocaGame
     Given User is on Mobile Legends Page of VocaGame
     Then Konfirmasi Top Up Button on Mobile Legends Page of VocaGame is disabled


  @VocaGameMobileLegends2
  Scenario: Test with invalid kode voucher
     Given User is on Mobile Legends Page of VocaGame
     When User chooses 3 Diamonds on Mobile Legends Page of VocaGame
     And User types "AB" on Kode Voucher textbox on Mobile Legends Page of VocaGame
     And User clicks Pakai Kode Voucher Button on Mobile Legends Page of VocaGame
     Then the validation messages appears on Mobile Legends Page of VocaGame1
      |Kode voucher AB tidak ditemukan|

    @VocaGameMobileLegends3
  Scenario: Test with invalid ID
       Given User is on Mobile Legends Page of VocaGame
     When User chooses 3 Diamonds on Mobile Legends Page of VocaGame
     And User types "123456" on User ID textbox on Mobile Legends Page of VocaGame
      And User types "123456" on Zone ID textbox on Mobile Legends Page of VocaGame
       And User types "8326755" on Whatsapp textbox on Mobile Legends Page of VocaGame
       And User clicks QRIS as payment on Mobile Legends Page of VocaGame
     And User clicks Konfirmasi Top Up Button on Mobile Legends Page of VocaGame
     Then the validation messages appears on Mobile Legends Page of VocaGame2
      |ID advanced server|