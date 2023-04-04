# Spring Boot 3

## 4/4/23
Wrote a Dockerfile with some of the setup. `docker build .` builds the image. `docker run -p 8080:8080 {image_id}` throws error
```
docker: Error response from daemon: failed to create shim task: OCI runtime create failed: runc create failed: unable to start container process: exec: "mvn": executable file not found in $PATH: unknown.
```

Docker is unable to start a container for the app because the executable file for the `mvn` command is not found in the container's $PATH.  
### To Do
I need to adjust the Dockerfile for my app to ensure that Maven is installed and the $PATH variable is set correctly in the Docker container.

---
## 3/10/23
Wrote this into a small static webpage. It'll be used as a test run for containerization and using Docker. Let's GO!

## 2/4/23

So far I'm just making HTML tags with Java.  
It's a bit frivolous maybe, but I'm just seeing what I can do with altering the Java whitelabel error page. Rather than be greeted with an error, why not make the server atleast say hello?

