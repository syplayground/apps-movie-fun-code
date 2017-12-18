package org.superbiz.moviefun.blobstore;

import java.io.InputStream;

public class Blob {
    public final String name;
    public final InputStream inputStream;
    public final String contentType;

    public Blob(String name, InputStream inputStream, String contentType) {
        this.name = name;
        this.inputStream = inputStream;
        this.contentType = contentType;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> f8e290237d287664862c9c8a56dc39c65cdd7947
