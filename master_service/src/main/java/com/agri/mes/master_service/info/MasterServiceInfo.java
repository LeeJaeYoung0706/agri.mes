package com.agri.mes.master_service.info;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "master-service")
@Getter
@Setter
public class MasterServiceInfo {

    @Getter @Setter
    public static class Info {
        private String message; // 공지사항 , 메세지
        private String releaseVersion; // 릴리즈 버전
        private String buildNo; // ci 빌드 번호
        private String commitSha; // 배포 추적용
    }
}
