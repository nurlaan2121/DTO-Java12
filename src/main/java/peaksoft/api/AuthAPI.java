package peaksoft.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.dto.request.SignInRequest;
import peaksoft.dto.request.SignUpRequest;
import peaksoft.dto.response.SignResponse;
import peaksoft.dto.response.SimpleResponse;
import peaksoft.service.UserService;

/**
 * @author Mukhammed Asantegin
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthAPI {
    private final UserService userService;

    @PostMapping
    public SimpleResponse signUp(@RequestBody SignUpRequest signUpRequest){
        return userService.signUp(signUpRequest);
    }

    @GetMapping
    public SignResponse signIn(@RequestBody SignInRequest signInRequest){
        return userService.signIn(signInRequest);
    }


}
