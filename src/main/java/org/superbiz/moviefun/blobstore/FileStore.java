package org.superbiz.moviefun.blobstore;

import org.apache.tika.Tika;
import org.apache.tika.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Optional;

<<<<<<< HEAD
public class FileStore implements BlobStore {
    private final Tika tika = new Tika();

    @Override
    public void put(Blob blob) throws IOException {
        File targetFile = new File(blob.name);
=======

public class FileStore implements BlobStore {

    private final Tika tika = new Tika();


    @Override
    public void put(Blob blob) throws IOException {
        File targetFile = new File(blob.name);

>>>>>>> f8e290237d287664862c9c8a56dc39c65cdd7947
        targetFile.delete();
        targetFile.getParentFile().mkdirs();
        targetFile.createNewFile();

<<<<<<< HEAD
=======

>>>>>>> f8e290237d287664862c9c8a56dc39c65cdd7947
        try (FileOutputStream outputStream = new FileOutputStream(targetFile)) {
            IOUtils.copy(blob.inputStream, outputStream);
        }
    }

    @Override
    public Optional<Blob> get(String name) throws IOException {
        File file = new File(name);

        if (!file.exists()) {
            return Optional.empty();
        }

        return Optional.of(new Blob(
<<<<<<< HEAD
                name,
                new FileInputStream(file),
                tika.detect(file)
=======
            name,
            new FileInputStream(file),
            tika.detect(file)
>>>>>>> f8e290237d287664862c9c8a56dc39c65cdd7947
        ));
    }

    @Override
    public void deleteAll() {
<<<<<<< HEAD
        // ...
    }
}
=======

    }
}
>>>>>>> f8e290237d287664862c9c8a56dc39c65cdd7947
