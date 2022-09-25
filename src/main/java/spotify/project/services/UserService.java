package spotify.project.services;


import org.springframework.http.ResponseEntity;
import spotify.project.command.CityDto;
import spotify.project.command.CityDtoWithCategory;
import spotify.project.command.CreateUserDto;
import spotify.project.command.UserDto;
import spotify.project.models.Role;
import spotify.project.models.User;

import java.util.List;

public interface UserService {
	UserDto registerUser(CreateUserDto user);

	Role saveRole(Role role);

	User addRoleToUser(String username, String roleType);

	UserDto findUserDtoByUsername(String username);

	List<UserDto> getUsers();

	boolean checkIfUserHasRole(User user, Role role);

	void createRoles();

	void createOwner();

	User findUserByUsername(String username);

	Role findRoleByRoleType(String roleType);

	boolean userExists(String username);

	boolean roleExists(String roleType);

	void deleteUser(String username);

	void deleteRole(String roleType);

	List<CityDto> getAllCitiesInDb();

	CityDto getCityDtoByName(String cityName);

	UserDto addCityToUser(String username, String cityName);

	UserDto addLivingCityToUser(String username, String cityName);

    List<CityDto> getAllCitiesVisitedByUser(String username);

    CityDto getUserLivingCity(String username);

    List<CityDto> getCitiesInDBOrdered();

    List<CityDtoWithCategory> getCitiesWithCategoryBiggerThan(String category, Integer score);

   /* void addCityToUser(String username, String cityName);

    void addCityToUserListOfCities(String username, String cityName);*/
}
