package org.literacyapp.util;

import java.util.List;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class WordExtractionHelperTest {

    @Test
    public void testGetWords() {
        String paragraph = "\"Mom,\" called Lebo. \"Come and look. These clothes are all too small for me!\"";
        List<String> words = WordExtractionHelper.getWords(paragraph);
        assertThat(words.get(0), is("Mom"));
        assertThat(words.get(1), is("called"));
        assertThat(words.get(2), is("Lebo"));
        assertThat(words.get(3), is("Come"));
        assertThat(words.get(4), is("and"));
        assertThat(words.get(5), is("look"));
        assertThat(words.get(6), is("These"));
        assertThat(words.get(7), is("clothes"));
        assertThat(words.get(8), is("are"));
        assertThat(words.get(9), is("all"));
        assertThat(words.get(10), is("too"));
        assertThat(words.get(11), is("small"));
        assertThat(words.get(12), is("for"));
        assertThat(words.get(13), is("me"));
        
        paragraph = "\"Look at my skirt. It's too small,\" said Lebo.";
        words = WordExtractionHelper.getWords(paragraph);
        assertThat(words.get(0), is("Look"));
        assertThat(words.get(1), is("at"));
        assertThat(words.get(2), is("my"));
        assertThat(words.get(3), is("skirt"));
        assertThat(words.get(4), is("It's"));
        assertThat(words.get(5), is("too"));
        assertThat(words.get(6), is("small"));
        assertThat(words.get(7), is("said"));
        assertThat(words.get(8), is("Lebo"));
    }
}
