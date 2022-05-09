@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  Controller startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and CONTROLLER_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto execute

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\Controller-1.0-SNAPSHOT.jar;%APP_HOME%\lib\javafx-fxml-17.0.1-win.jar;%APP_HOME%\lib\javafx-controls-17.0.1-win.jar;%APP_HOME%\lib\javafx-controls-17.0.1.jar;%APP_HOME%\lib\javafx-graphics-17.0.1-win.jar;%APP_HOME%\lib\javafx-graphics-17.0.1.jar;%APP_HOME%\lib\javafx-base-17.0.1-win.jar;%APP_HOME%\lib\javafx-base-17.0.1.jar;%APP_HOME%\lib\Service-1.0-SNAPSHOT.jar;%APP_HOME%\lib\Persistence-1.0-SNAPSHOT.jar;%APP_HOME%\lib\Utils-1.0-SNAPSHOT.jar;%APP_HOME%\lib\Model-1.0-SNAPSHOT.jar;%APP_HOME%\lib\tornadofx-controls-1.0.3.jar;%APP_HOME%\lib\controlsfx-11.1.1.jar;%APP_HOME%\lib\formsfx-core-11.5.0.jar;%APP_HOME%\lib\bootstrapfx-core-0.4.0.jar;%APP_HOME%\lib\fontawesomefx-fontawesome-4.7.0-9.1.2.jar;%APP_HOME%\lib\grpc-protobuf-1.45.1.jar;%APP_HOME%\lib\grpc-stub-1.45.1.jar;%APP_HOME%\lib\javax.annotation-api-1.3.2.jar;%APP_HOME%\lib\grpc-netty-1.45.1.jar;%APP_HOME%\lib\hibernate-core-5.2.10.Final.jar;%APP_HOME%\lib\jaxb-runtime-2.3.2.jar;%APP_HOME%\lib\stax-ex-1.8.1.jar;%APP_HOME%\lib\jakarta.xml.bind-api-2.3.2.jar;%APP_HOME%\lib\javassist-3.28.0-GA.jar;%APP_HOME%\lib\spring-context-4.3.8.RELEASE.jar;%APP_HOME%\lib\postgresql-42.3.4.jar;%APP_HOME%\lib\log4j-core-2.17.2.jar;%APP_HOME%\lib\log4j-api-2.17.2.jar;%APP_HOME%\lib\fontawesomefx-commons-9.1.2.jar;%APP_HOME%\lib\grpc-protobuf-lite-1.45.1.jar;%APP_HOME%\lib\grpc-core-1.45.1.jar;%APP_HOME%\lib\grpc-api-1.45.1.jar;%APP_HOME%\lib\guava-31.0.1-android.jar;%APP_HOME%\lib\jsr305-3.0.2.jar;%APP_HOME%\lib\proto-google-common-protos-2.0.1.jar;%APP_HOME%\lib\protobuf-java-3.19.2.jar;%APP_HOME%\lib\error_prone_annotations-2.10.0.jar;%APP_HOME%\lib\netty-codec-http2-4.1.72.Final.jar;%APP_HOME%\lib\netty-handler-proxy-4.1.72.Final.jar;%APP_HOME%\lib\perfmark-api-0.23.0.jar;%APP_HOME%\lib\hibernate-commons-annotations-5.0.1.Final.jar;%APP_HOME%\lib\jboss-logging-3.3.0.Final.jar;%APP_HOME%\lib\hibernate-jpa-2.1-api-1.0.0.Final.jar;%APP_HOME%\lib\antlr-2.7.7.jar;%APP_HOME%\lib\jboss-transaction-api_1.2_spec-1.0.1.Final.jar;%APP_HOME%\lib\jandex-2.0.3.Final.jar;%APP_HOME%\lib\classmate-1.3.0.jar;%APP_HOME%\lib\dom4j-1.6.1.jar;%APP_HOME%\lib\istack-commons-runtime-3.0.8.jar;%APP_HOME%\lib\jakarta.activation-api-1.2.1.jar;%APP_HOME%\lib\txw2-2.3.2.jar;%APP_HOME%\lib\FastInfoset-1.2.16.jar;%APP_HOME%\lib\spring-aop-4.3.8.RELEASE.jar;%APP_HOME%\lib\spring-beans-4.3.8.RELEASE.jar;%APP_HOME%\lib\spring-expression-4.3.8.RELEASE.jar;%APP_HOME%\lib\spring-core-4.3.8.RELEASE.jar;%APP_HOME%\lib\checker-qual-3.12.0.jar;%APP_HOME%\lib\grpc-context-1.45.1.jar;%APP_HOME%\lib\failureaccess-1.0.1.jar;%APP_HOME%\lib\listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar;%APP_HOME%\lib\checker-compat-qual-2.5.5.jar;%APP_HOME%\lib\j2objc-annotations-1.3.jar;%APP_HOME%\lib\gson-2.8.9.jar;%APP_HOME%\lib\annotations-4.1.1.4.jar;%APP_HOME%\lib\animal-sniffer-annotations-1.19.jar;%APP_HOME%\lib\netty-codec-http-4.1.72.Final.jar;%APP_HOME%\lib\netty-handler-4.1.72.Final.jar;%APP_HOME%\lib\netty-codec-socks-4.1.72.Final.jar;%APP_HOME%\lib\netty-codec-4.1.72.Final.jar;%APP_HOME%\lib\netty-transport-4.1.72.Final.jar;%APP_HOME%\lib\netty-buffer-4.1.72.Final.jar;%APP_HOME%\lib\netty-resolver-4.1.72.Final.jar;%APP_HOME%\lib\netty-common-4.1.72.Final.jar;%APP_HOME%\lib\commons-logging-1.2.jar;%APP_HOME%\lib\netty-tcnative-classes-2.0.46.Final.jar


@rem Execute Controller
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %CONTROLLER_OPTS%  -classpath "%CLASSPATH%" StartApp %*

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable CONTROLLER_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%CONTROLLER_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
