package iloveyouboss;

import org.junit.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProfileTest {
   private Profile profile;
   private Question questionIsThereRelocationPackage;
   private Answer answerThereIsRelocationPackage;
   private Criterion criterion;
    @Before
    public void createProfile(){
        profile = new Profile();
    }
    @Before
    public void createQuestionsAndAnswers(){
        questionIsThereRelocationPackage =  new Question(1,"Relocation Package?");
        answerThereIsRelocationPackage = new Answer(questionIsThereRelocationPackage,Bool.TRUE);
    }
    @Test
    public void matchesNothingWhenProfileEmpty(){
        criterion = new Criterion(answerThereIsRelocationPackage,Weight.DontCare);
        assertFalse(profile.matches(criterion));
    }
    @Test
    public void matchesWhenProfileContainsMatchingAnswer(){
        profile.add(answerThereIsRelocationPackage);
        criterion = new Criterion(answerThereIsRelocationPackage,Weight.Important);
        assertTrue(profile.matches(criterion));

    }
}
