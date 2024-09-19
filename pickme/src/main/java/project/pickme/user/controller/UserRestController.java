package project.pickme.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import project.pickme.common.annotation.CurrentUser;
import project.pickme.common.response.BaseResponse;
import project.pickme.user.domain.User;
import project.pickme.user.dto.PasswordDto;
import project.pickme.user.service.UserService;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserRestController {
	private final UserService userService;

	@PostMapping("/check-id")
	public BaseResponse<?> checkDuplicateUserId(@RequestBody String id) {
		userService.checkDuplicateId(id);

		return BaseResponse.ok("사용 가능한 아이디");
	}


	// @PutMapping("/info")
	// public BaseResponse<?> updateInfo(@RequestBody UpdateInfoDto updateInfoDto, @CurrentUser User user){
	// 	userService.updateInfo(updateInfoDto, user);
	//
	// 	return BaseResponse.ok();
	// }

	@PutMapping("/password")
	public BaseResponse<?> updatePassword(@RequestBody PasswordDto passwordDto, @CurrentUser User user){
		userService.updatePassword(passwordDto, user);

		return BaseResponse.ok();
	}
}
