package com.mydomusfinance.om;

import com.mydomusfinance.om.domain.user.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;
import java.time.LocalDateTime;
import java.util.UUID;

public class UserTest {

    static User user;

    @BeforeAll
    static void onBeforeEach(){
        user = new User(, "Felipe", "felipe@email.com", "password123", true, LocalDateTime.now() );
    }

    @Test
    void of_WhenInputIsNull_ThenThrowIllegalArgumentException(){

    }
}
