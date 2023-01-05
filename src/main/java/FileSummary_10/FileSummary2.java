package FileSummary_10;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileSummary2 {

    public static void recursiveFileLists (String dirPath) {
        File dir = new File(dirPath);
        for (File file : dir.listFiles()) {
            if (file.isDirectory()) recursiveFileLists(file.getPath());
            else System.out.println(file);
        }
    }

    public static void main(String[] args) {
//
//        // TODO 현재 경로 구하는 법 1
        String path = System.getProperty("user.dir");
        System.out.println(path);
        System.out.println("=====================================");
//
//
//        // TODO 현재 경로 구하는 법 2 -> "" = 상대경로 -> 절대경로
        Path relativePath = Paths.get("");
        String absolutePath = relativePath.toAbsolutePath().toString();
        System.out.println(absolutePath);
        System.out.println("=====================================");
//
//
//        // TODO 현재 경로 구하는 법 3
        String currentUserDirectory = new File("").getAbsolutePath();
        System.out.println(currentUserDirectory);
        System.out.println("=====================================");
//
//
//        // TODO 현재 경로에서 모든 파일들 검색 (재귀 x)
        String currentDirectory2 = System.getProperty("user.dir");
        File file = new File(currentDirectory2);
        if (file.isDirectory())
            for (File val : file.listFiles())
                System.out.println(val);
        System.out.println("=====================================");
//
//
//        // TODO 현재 경로에서 모든 파일들 검색 (재귀 o)
        recursiveFileLists("D:\\fast_java1\\fast_java_prac\\simple_prac");
        System.out.println("=====================================");


//         // TODO 직접 File Stream 을 만들어 필터링
        File seed = new File("D:\\fast_java1\\fast_java_prac\\simple_prac");
        Stream<File> stream = Arrays.stream(seed.listFiles());
        List<String> results = stream.filter(value -> String.valueOf(value).endsWith("out"))
                .map(File::getName)
                .collect(Collectors.toList());
        results.forEach(System.out::println);
        System.out.println("=====================================");


        Path currentPath = Paths.get("").toAbsolutePath();
        FileSystem fileSystem = currentPath.getFileSystem();
        System.out.println(fileSystem);

        System.out.println(fileSystem.getRootDirectories());

        FileSystem fs = new File("").getAbsoluteFile().toPath().getFileSystem();


    }
}
