package ru.tbrumble.userverifier.services;

import ru.tbrumble.userverifier.model.web.WebVerificatePackage;

public interface VerificationService {
    WebVerificatePackage verifyUserData(WebVerificatePackage webVerificatePackage);
    WebVerificatePackage getExample();
}
