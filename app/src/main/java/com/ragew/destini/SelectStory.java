package com.ragew.destini;

/**
 * Created by ragew on 1/11/2018.
 */

public class SelectStory {
    private int m_storyIndex;

    public SelectStory (int storyIndex){
        m_storyIndex = storyIndex;
    }

    public int getStoryIndex() {
        return m_storyIndex;
    }

    public void setStoryIndex(int storyIndex) {
        m_storyIndex = storyIndex;
    }
}
