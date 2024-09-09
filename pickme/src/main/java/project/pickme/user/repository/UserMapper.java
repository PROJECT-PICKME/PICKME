package project.pickme.user.repository;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import project.pickme.user.domain.User;

@Mapper
public interface UserMapper {
	void save(User user);

	Optional<User> findById(String id);

	void deleteAll();
}
