package iloveyouboss;

import org.junit.*;

import static org.junit.Assert.assertFalse;

public class ProfileTest {
   private Profile profile;
   private Question hasRelocationPackage;
   private Criterion criterion;
    @Before
    public void createProfile(){
        profile = new Profile();
    }
    @Before
    public void createQuestions(){
        hasRelocationPackage =  new Question(1,"Relocation Package?");
    }
    @Test
    public void matchesNothingWhenEmptyProfile(){
       profile =  new Profile();
       criterion = new Criterion(new Answer(hasRelocationPackage, Bool.TRUE),Weight.DontCare);

       assertFalse(profile.matches(criterion));

    }
}
