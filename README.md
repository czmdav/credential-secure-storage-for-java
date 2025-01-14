# Credential Secure Storage for Java 
Unified interface to store Java application secrets on different platforms backed by built-in credential managers.

The library is derivative work from [Visual Studio Team Services Authentication Library for Java (Preview)](https://github.com/microsoft/vsts-authentication-library-for-java), 
`auth-secure-storage` module in particular, focusing on secure storage only.  

# What this library provides
This library provides a set of secure `storage` providers that store retrieved secrets, as well as In memory insecure storage.   

### Available Secure Storage Providers:
| Secret Type                                          | Windows<br/>(Credential Manager) | Linux <br/>(GNOME&nbsp;Keyring&nbsp;v2.22+/Libsecret) | Mac OSX<br/>(Keychain)|
|------------------------------------------------------|------------------------------|---------------------------------------------------------|-------------------|
| Username / Password Credentials (`StoredCredential`) | Yes | Yes                                                     | Yes |
| OAuth2 Access/Refresh Token (`StoredTokenPair`)      | Yes (On Windows 7, 8/8.1 and 10) | Yes                                                     | Yes | 
| Personal Access Token (`StoredToken`)                | Yes | Yes                                                     | Yes |

# How to use this library
Maven is the preferred way to referencing this library.  

```xml
  <dependency>
    <groupId>com.microsoft</groupId>
    <artifactId>credential-secure-storage</artifactId>
    <version>1.0.1-SNAPSHOT</version>
  </dependency>
```

Here is sample code for [credentials](sample/src/main/java/com/microsoft/credentialstorage/sample/StoredCredentialApp.java) 
that shows how to use this library.


# How to build
1. JDK 11
2. Maven 3.8+
3. `mvn clean verify`

# License
The MIT license can be found in [LICENSE.txt](LICENSE.txt)
See the [NOTICE.txt](NOTICE.txt) file for required notices and attributions.

# Trademarks
This project may contain trademarks or logos for projects, products, or services. Authorized use of Microsoft trademarks or logos is subject to and must follow Microsoft’s Trademark & Brand Guidelines. Use of Microsoft trademarks or logos in modified versions of this project must not cause confusion or imply Microsoft sponsorship. Any use of third-party trademarks or logos are subject to those third-party’s policies.
