$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/VocaGameLogin.feature");
formatter.feature({
  "name": "VocaGame Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test Login when the nomor whatsapp textbox and password textbox are both empty on VocaGame Login Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@VocaGameLogin1"
    }
  ]
});
formatter.step({
  "name": "User is on Login Page of VocaGame",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_is_on_login_page_of_voca_game()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks button \"Masuk Sekarang\" on Login Page of VocaGame",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_clicks_button_on_login_page_of_voca_game(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the validation messages appears on Login Page of VocaGame1",
  "rows": [
    {
      "cells": [
        "Nomor WhatsApp tidak boleh kosong!"
      ]
    },
    {
      "cells": [
        "Password tidak boleh kosong!"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Login.the_validation_messages_appears_on_login_page_of_voca_game1(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test Login when correct whatsapp number but wrong password on VocaGame Login Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@VocaGameLogin2"
    }
  ]
});
formatter.step({
  "name": "User is on Login Page of VocaGame",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_is_on_login_page_of_voca_game()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User puts the following on Login Page of VocaGame",
  "rows": [
    {
      "cells": [
        "123456789"
      ]
    },
    {
      "cells": [
        "abcdef58"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_puts_the_following_on_login_page_of_voca_game(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the validation messages appears on Login Page of VocaGame2",
  "rows": [
    {
      "cells": [
        "Wrong password. Verify and try again."
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Login.the_validation_messages_appears_on_login_page_of_voca_game2(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test Login when whatsapp number is not registered on VocaGame Login Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@VocaGameLogin3"
    }
  ]
});
formatter.step({
  "name": "User is on Login Page of VocaGame",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_is_on_login_page_of_voca_game()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User puts the following on Login Page of VocaGame",
  "rows": [
    {
      "cells": [
        "89755579262"
      ]
    },
    {
      "cells": [
        "abcdef58"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_puts_the_following_on_login_page_of_voca_game(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the validation messages appears on Login Page of VocaGame3",
  "rows": [
    {
      "cells": [
        "Phone number not found. Please use a valid, registered number."
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Login.the_validation_messages_appears_on_login_page_of_voca_game3(DataTable)"
});
formatter.result({
  "status": "passed"
});
});