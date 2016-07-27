package Model;

import com.google.firebase.auth.FirebaseUser;

import java.io.Serializable;

public class User implements Serializable {

    private String mId;
    private String mName;
    private String mPhotoUrl;
    private String mEmail;

    public User() {
        mId = "";
        mName = "";
        mPhotoUrl = "";
        mEmail = "";
    }

    public User(String id, String name, String photoUrl, String email) {
        mId = id;
        mName = name;
        mPhotoUrl = photoUrl;
        mEmail = email;
    }

    public User(FirebaseUser firebaseUser) {
        mId = firebaseUser.getUid();
        mName = firebaseUser.getDisplayName();
        mEmail = firebaseUser.getEmail();
        mPhotoUrl = "";

        if (firebaseUser.getPhotoUrl() != null) {
            mPhotoUrl = firebaseUser.getPhotoUrl().toString();
        }
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPhotoUrl() {
        return mPhotoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        mPhotoUrl = photoUrl;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }
}