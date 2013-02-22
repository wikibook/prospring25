해당 CHAPTER의 예제를 실행하기 위해서는 web 디렉토리를 web root 경로로 잡아주시고 was를 기동해주시면 됩니다.
반드시 그전에 해당 예제의 컴파일을 한 후에 prospring-ch08/web/WEB-INF/classes/ 해당 디렉토리 밑으로 class 파일들을 
옮겨주신 후 진행하십시오.

jconsole 관련 예제 실행시 책에서는 
-Dcom.sun.management.jmxremote 해당 옵션만 jvm arguments로 등록하라고 나오나, 혹시나 해당 옵션 등록 후에도 
마찬가지로 예외가 발생한다면  -Dcom.sun.management.jmxremote.local.only=false 해당옵션까지 더해서 
-Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.local.only=false 이런형태의 arguments로 등록하여
실행하시면 됩니다.
