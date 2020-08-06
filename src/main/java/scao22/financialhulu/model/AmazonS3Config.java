package scao22.financialhulu.model;

import com.amazonaws.auth.BasicSessionCredentials;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;

@Configuration
public class AmazonS3Config
{
    @Value("${aws.access.key.id}")
    private String awsKeyId;

    @Value("${aws.access.key.secret}")
    private String awsKeySecret;

    @Value("${aws.access.session.token}")
    private String awsSessionToken;

//    @Value("${aws.region}")
//    private String awsRegion;

    @Value("${aws.s3.audio.bucket}")
    private String awsS3AudioBucket;

    @Value("${aws.s3.folder}")
    private String awsS3folder;

    @Bean(name = "awsKeyId")
    public String getAWSKeyId() {
        return awsKeyId;
    }

    @Bean(name = "awsKeySecret")
    public String getAWSKeySecret() {
        return awsKeySecret;
    }

    @Bean(name = "awsSessionToken")
    public String getAWSSessionToken() {
        return awsSessionToken;
    }

//    @Bean(name = "awsRegion")
//    public Region getAWSPollyRegion() {
//        return Region.getRegion(Regions.fromName(awsRegion));
//    }

    @Bean(name = "awsCredentialsProvider")
    public AWSCredentialsProvider getAWSCredentials() {
        BasicSessionCredentials awsCredentials = new BasicSessionCredentials(this.awsKeyId, this.awsKeySecret, this.awsSessionToken);
        return new AWSStaticCredentialsProvider(awsCredentials);
    }

    @Bean(name = "awsS3AudioBucket")
    public String getAWSS3AudioBucket() {
        return awsS3AudioBucket;
    }

    @Bean(name = "awsS3folder")
    public String getAWSS3folder() {
        return awsS3folder;
    }
}