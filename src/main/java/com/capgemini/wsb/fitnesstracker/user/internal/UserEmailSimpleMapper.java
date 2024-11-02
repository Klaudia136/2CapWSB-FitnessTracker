package com.capgemini.wsb.fitnesstracker.user.internal;
import com.capgemini.wsb.fitnesstracker.user.api.User;
import org.springframework.stereotype.Component;
@Component
class UserEmailSimpleMapper {

    User toSimpleEmailEntity(UserEmailSimpleDto userDto) {
        return new User(null, null, null, userDto.email());
    }
    UserEmailSimpleDto toEmailSimpleDto(User user) {
        return new UserEmailSimpleDto(user.getId(), user.getEmail());
    }
}