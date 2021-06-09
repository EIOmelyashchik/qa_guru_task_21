# Wikipedia Android tests
### To run tests locally (default):
```
gradle clean test -Ddevice.name={real_or_emulator}
```
### To run tests on Selenoid:
```
gradle clean test -Ddevice.host=selenoid
```
### To run tests on BrowserStack:
```
gradle clean test -Ddevice.host=browser_stack
```