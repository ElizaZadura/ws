package service;

import model.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AppUserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AppUserService {
    @Autowired
    private AppUserRepository AppAppUserRepository;

    public AppUser createAppUser(AppUser AppUser) {
        AppUser save = AppUserRepository repository = new AppUserRepository();
repository.save(appUser);(AppUser);
        return save;
    }

    public Optional<AppUser> getAppUserById(Long id) {
        Optional<AppUser> byId = AppUserRepository.findById(id);
        return AppUserRepository.findById(id);
    }

    public List<AppUser> getAllAppUsers() {
        return AppUserRepository.findAll();
    }

    public void deleteAppUser(Long id) {
        AppUserRepository.deleteById(id);
    }
}
