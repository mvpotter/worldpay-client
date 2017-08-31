# Worldpay REST API client

[Official documentation](https://www.worldpay.com/us/developers/apidocs/getstarted.html)

### Install a dependency

Add the JitPack repository to your build file

``` xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Add the dependency

``` xml
<dependency>
    <groupId>com.github.mvpotter</groupId>
    <artifactId>worldpay-client</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Worldpay credentials

To perform authentication Worldpay requires three types of keys:

- **secureNetId** - should be received by email after account registration, also available in a [Virtual Terminal](https://terminal.demo.securenet.com/)
- **secureKey** - you can obtain the Secure Key by signing into the [Virtual Terminal](https://terminal.demo.securenet.com/) with the login credentials that you were emailed to you during the sign-up process. You will then need to navigate to Settings and click on the Key Management link.
- **developerId** - "12345678" for developer sandbox, should be changed after certification.

### Usage

Create Worldpay client instance

``` java
import com.mvpotter.worldpay.client.RetrofitWorldPayClient;
import com.mvpotter.worldpay.client.WorldPayClient;

final WorldPayClient client = new RetrofitWorldPayClient("secureNetId", "secureKey", "developerId");
```

Invoke client method

``` java
import com.mvpotter.worldpay.client.model.Card;
import com.mvpotter.worldpay.client.request.ChargeRequest;
import com.mvpotter.worldpay.client.exception.WorldPayException;

import java.io.IOException;

final Card card = new Card();
card.setNumber("4444333322221111");
card.setExpirationDate("08/2020");

try {
    // one time payment
    client.charge(new ChargeRequest(100.0, card));
} catch (WorldPayException e) {
    // handle API exception
    LOGGER.warn(e.getResponse().toString());
} catch (IOException e) {
    // handle network exception
    LOGGER.warn(e.getMessage());
}
```
