package FileSummary_10;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;

public class FileSummary {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\revi1\\Desktop\\My-doc\\Web_doc");

        // 현재 파일 이름 출력
        System.out.println(file.getName());

        // 파일인지?
        // 디렉터리인지?
        // 절대경로인지 확인
        // Hidden 파일인지 확인
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.isAbsolute());
        System.out.println(file.isHidden());

        // 파일에 쓸 수 있는지
        // 파일을 읽을 수 있는지
        // 파일을 실행할 수 있는지
        System.out.println(file.canWrite());
        System.out.println(file.canRead());
        System.out.println(file.canExecute());

        // 상위 촐더 이름 출력
        System.out.println(file.getParent());
        System.out.println(file.getParentFile());

        // 절대 경로 출력
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getPath());

        // 파일들 출력
        System.out.println(file.listFiles());
        System.out.println(Arrays.toString(file.listFiles()));

        // URI 로 변경. file://
        URI uri = file.toURI();
        System.out.println(uri);

        // mkdir 은 한 번에 하나의 디렉터리만 생성함.
        // mkdirs 는 한 번에 여러 디렉터리를 생성함.
        File files = new File("C:\\Users\\revi1\\Desktop\\My-doc\\Web_doc\\prac.txt");
        System.out.println(files.mkdir());
        System.out.println(files.mkdirs());

        // 총 공간
        // 현재 남은 공간
        System.out.println(file.getTotalSpace());
        System.out.println(file.getFreeSpace());
        System.out.println(file.getUsableSpace());


        // 실행권한 부여 (SecurityException throw 할 수도 있음.)



    }
}
