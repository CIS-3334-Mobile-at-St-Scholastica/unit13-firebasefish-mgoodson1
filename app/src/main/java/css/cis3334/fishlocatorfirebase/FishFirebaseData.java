package css.cis3334.fishlocatorfirebase;

import android.util.Log;

import com.google.firebase.auth.FirebaseAuthException;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cssuser on 4/20/2017.
 */

public class FishFirebaseData {

    public static final String FishDataTag = "Fish Data";
    private FirebaseAuth mAuth;

    public DatabaseReference open()  {
        // Get an instance of the database and a reference to the fish data in it
        mAuth = FirebaseAuth.getInstance();

    }

    public void close() {

    }

    public Fish createFish( String species, String weightInOz, String dateCaught) {           //Added String rating as a parameter
        // ---- Get a new database key for the vote

        // ---- set up the fish object

        // ---- write the vote to Firebase

        return newFish;
    }

    public Fish createFish( String species, String weightInOz, String dateCaught, String locationLatitude, String locationLongitude) {           //Added String rating as a parameter
        // ---- Get a new database key for the vote

        // ---- set up the fish object

        // ---- write the vote to Firebase

        return newFish;
    }

    public void deleteFish(Fish fish) {

    }

    public List<Fish> getAllFish(DataSnapshot dataSnapshot) {

    }

}
