package org.superbiz.moviefun.blobstore;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.util.IOUtils;
import org.apache.tika.Tika;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class S3Store implements BlobStore {

    private final AmazonS3 s3;
    private final String bucketName;
    private final Tika tika = new Tika();

    public S3Store(AmazonS3 s3, String bucketName) {
        this.s3 = s3;
        this.bucketName = bucketName;
    }


    @Override
    public void put(Blob blob) throws IOException {
        s3.putObject(bucketName, blob.name, blob.inputStream, new ObjectMetadata());
    }

    @Override
    public Optional<Blob> get(String name) throws IOException {
        if (!s3.doesObjectExist(bucketName, name)) {
            return Optional.empty();
        }

        try (S3Object s3Object = s3.getObject(bucketName, name)) {
            S3ObjectInputStream content = s3Object.getObjectContent();

            byte[] bytes = IOUtils.toByteArray(content);

            return Optional.of(new Blob(
<<<<<<< HEAD
                    name,
                    new ByteArrayInputStream(bytes),
                    tika.detect(bytes)
=======
                name,
                new ByteArrayInputStream(bytes),
                tika.detect(bytes)
>>>>>>> f8e290237d287664862c9c8a56dc39c65cdd7947
            ));
        }
    }

    @Override
    public void deleteAll() {
        List<S3ObjectSummary> summaries = s3
<<<<<<< HEAD
                .listObjects(bucketName)
                .getObjectSummaries();
=======
            .listObjects(bucketName)
            .getObjectSummaries();
>>>>>>> f8e290237d287664862c9c8a56dc39c65cdd7947

        for (S3ObjectSummary summary : summaries) {
            s3.deleteObject(bucketName, summary.getKey());
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> f8e290237d287664862c9c8a56dc39c65cdd7947
