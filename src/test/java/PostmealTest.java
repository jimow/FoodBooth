import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Rule;
        import org.junit.Test;

        import java.util.Arrays;

        import static org.junit.Assert.*;

public class PostmealTest {
    @Rule
    public   DatabaseRule database = new DatabaseRule();


    @Test
    public void Postmeal_instanceOfPostmeal_true(){
        Postmeal testPostmeal = createPostmeal();
        assertEquals(true, testPostmeal instanceof Postmeal);
    }
    @Test
    public void getName_returnNameOfMeal_cat(){
        Postmeal testPostmeal = createPostmeal();
        assertEquals("Pilau", testPostmeal.getName());
    }
    @Test
    public void getDescription_returnDescriptionLevelOfTheMeal_okay(){
        Postmeal testPostmeal = createPostmeal();
        assertEquals("Spices, meat and rice. Come enjoy a meal.", testPostmeal.getDescription());
    }
    @Test
    public void getCook_returnCookLevelOfTheMeal_okay(){
        Postmeal testPostmeal = createPostmeal();
        assertEquals("Billy Ayiera", testPostmeal.getCook());
    }
    @Test
    public void equals_returnsTrueIfNamesAreTheSame_true(){
        Postmeal testPostmeal = createPostmeal();
        assertTrue(testPostmeal.equals(testPostmeal));
    }
    @Test
    public void save_savesPostmealInstanceToDB_Postmeal(){
        Postmeal testPostmeal = createPostmeal();
        testPostmeal.save();
        assertTrue(Postmeal.all().get(0).equals(testPostmeal));
    }
    @Test
    public void id_assignIdToSpecificInstance(){
        Postmeal testPostmeal = createPostmeal();
        testPostmeal.save();
        Postmeal savedPostmeal = (Postmeal) Postmeal.all().get(0);
        assertEquals(testPostmeal.getId(), savedPostmeal.getId());
    }
    @Test
    public void all_returnsAllInstancesOfPostmealTest_true(){
        Postmeal testPostmeal = createPostmeal();
        testPostmeal.save();
        Postmeal testSecondMeal = createPostmeal();
        testSecondMeal.save();

        assertEquals(true, testPostmeal.all().get(0).equals(testPostmeal));
        assertEquals(true, testSecondMeal.all().get(1).equals(testSecondMeal));
    }
    @Test
    public void all_returnsMealById() throws Exception{
        Postmeal testPostmeal = createPostmeal();
        testPostmeal.save();
        Postmeal testSecondMeal = createPostmeal();
        testSecondMeal.save();

        assertEquals(true, testSecondMeal.find(testSecondMeal.getId()).equals(testSecondMeal));
    }




    public Postmeal createPostmeal(){
        return new Postmeal("Pilau","Spices, meat and rice. Come enjoy a meal.", "Billy Ayiera");}
    }
