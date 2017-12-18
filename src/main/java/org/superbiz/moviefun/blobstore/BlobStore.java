package org.superbiz.moviefun.blobstore;

import java.io.IOException;
import java.util.Optional;

public interface BlobStore {

    void put(Blob blob) throws IOException;

    Optional<Blob> get(String name) throws IOException;

    void deleteAll();
<<<<<<< HEAD
}
=======
}
>>>>>>> f8e290237d287664862c9c8a56dc39c65cdd7947
