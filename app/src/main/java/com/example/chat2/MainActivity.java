package com.example.chat2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button suggestRecipeButton,B1;
    CheckBox I1,I2,I3,I4,I5,I6,I7,I8,I9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        suggestRecipeButton = findViewById(R.id.suggestRecipeButton);
        I1 = findViewById(R.id.item1CheckBox);
        I2 = findViewById(R.id.item2CheckBox);
        I3 = findViewById(R.id.item3CheckBox);
        I4 = findViewById(R.id.item4CheckBox);
        I5 = findViewById(R.id.item5CheckBox);
        I6 = findViewById(R.id.item6CheckBox);
        I7 = findViewById(R.id.item7CheckBox);
        I8 = findViewById(R.id.item8CheckBox);
        I9 = findViewById(R.id.item9CheckBox);
        B1 = findViewById(R.id.button);

        suggestRecipeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suggest();
            }
        });

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });
    }

    public void suggest() {
        List<String> selectedIngredients = new ArrayList<>();

        if (I1.isChecked()) {
            selectedIngredients.add("Potatoes");
        }
        if (I2.isChecked()) {
            selectedIngredients.add("Cauliflower");
        }
        if (I3.isChecked()) {
            selectedIngredients.add("Tomato");
        }
        if (I4.isChecked()) {
            selectedIngredients.add("Onion");
        }
        if (I5.isChecked()) {
            selectedIngredients.add("Green Chili");
        }
        if (I6.isChecked()) {
            selectedIngredients.add("Cumin");
        }
        if (I7.isChecked()) {
            selectedIngredients.add("Turmeric");
        }
        if (I8.isChecked()) {
            selectedIngredients.add("Eggplant");
        }
        if (I9.isChecked()) {
            selectedIngredients.add("Garlic");
        }

        String suggestedRecipe = getSuggestedRecipe(selectedIngredients);

        if (selectedIngredients.size() == 0) {
            Toast.makeText(this, "Please select at least one ingredient.", Toast.LENGTH_SHORT).show();
        } else if (suggestedRecipe.equals("No recipe found with the selected ingredients.")) {
            Toast.makeText(this, "No recipe found with the selected ingredients.", Toast.LENGTH_SHORT).show();
        } else {
            startNextActivity(selectedIngredients, suggestedRecipe);
        }
    }

    String getSuggestedRecipe(List<String> selectedIngredients) {
        if (selectedIngredients.contains("Eggplant") &&
                selectedIngredients.contains("Potatoes") &&
                selectedIngredients.contains("Tomato") &&
                selectedIngredients.contains("Onion") &&
                selectedIngredients.contains("Green Chili") &&
                selectedIngredients.contains("Garlic") &&
                selectedIngredients.contains("Cumin") &&
                selectedIngredients.contains("Turmeric")) {
            return "Here's a recipe for Aloo Baingan ki Sabzi:\n" +
                    "\n" +
                    "Ingredients:\n" +
                    "- 2 medium-sized potatoes, peeled and cubed\n" +
                    "- 1 medium-sized eggplant, cubed\n" +
                    "- 2 medium-sized tomatoes, chopped\n" +
                    "- 1 onion, chopped\n" +
                    "- 2 green chilies, chopped\n" +
                    "- 3-4 cloves of garlic, minced\n" +
                    "- 1 teaspoon cumin seeds\n" +
                    "- 1/2 teaspoon turmeric powder\n" +
                    "- Salt to taste\n" +
                    "- 2 tablespoons oil\n" +
                    "\n" +
                    "Instructions:\n" +
                    "1. Heat the oil in a pan over medium heat. Add cumin seeds and let them splutter.\n" +
                    "2. Add onions and sauté until translucent.\n" +
                    "3. Add green chilies and garlic and sauté for 1-2 minutes.\n" +
                    "4. Add chopped tomatoes and sauté until they turn mushy.\n" +
                    "5. Add turmeric powder and mix well.\n" +
                    "6. Add cubed potatoes and eggplant, and mix well with the tomato mixture.\n" +
                    "7. Add salt to taste and mix well.\n" +
                    "8. Cover and cook for 10-15 minutes on low heat until the vegetables are cooked and tender.\n" +
                    "9. Stir occasionally to prevent the vegetables from sticking to the bottom of the pan.\n" +
                    "10. Once the vegetables are cooked, turn off the heat and let the sabzi sit covered for a few minutes before serving.\n" +
                    "11. Serve hot with chapatis or rice.\n" +
                    "\n" +
                    "Enjoy your Aloo Baingan ki Sabzi!\n";

        } else if (selectedIngredients.contains("Potatoes") &&
                selectedIngredients.contains("Cauliflower") &&
                selectedIngredients.contains("Tomato") &&
                selectedIngredients.contains("Onion") &&
                selectedIngredients.contains("Green Chili") &&
                selectedIngredients.contains("Garlic") &&
                selectedIngredients.contains("Cumin") &&
                selectedIngredients.contains("Turmeric")){
            return "Here's a simple recipe for Aloo Gobi Masala using the ingredients you provided:\n"+
                    "\n" +
                    "Ingredients:\n" +
                    "- 2 medium potatoes, peeled and chopped\n" +
                    "- 1 small cauliflower, chopped into florets\n" +
                    "- 1 medium tomato, chopped\n" +
                    "- 1 small onion, finely chopped\n" +
                    "- 1-2 green chilies, chopped\n" +
                    "- 2-3 garlic cloves, chopped\n" +
                    "- 1 teaspoon cumin seeds\n" +
                    "- 1/2 teaspoon turmeric powder\n" +
                    "- Salt, to taste\n" +
                    "- Oil, for cooking\n" +
                    "\n" +
                    "Instructions:\n" +
                    "\n" +
                    "1. Heat some oil in a pan and add cumin seeds. Let them splutter.\n" +
                    "2. Add chopped onions and sauté until they turn golden brown.\n" +
                    "3. Add chopped garlic and green chilies and sauté for a minute.\n" +
                    "4. Add chopped tomatoes and cook until they become soft and mushy.\n" +
                    "5. Add turmeric powder and salt, mix well.\n" +
                    "6. Add chopped potatoes and cauliflower florets and mix everything together. \n" +
                    "7. Cover the pan and let the vegetables cook on low to medium heat for 10-12 minutes, stirring occasionally. \n" +
                    "8. Once the vegetables are cooked, remove the lid and stir-fry the mixture for a few minutes until it becomes dry.\n" +
                    "9. Garnish with some chopped coriander leaves and serve hot with roti or rice.\n" +
                    "\n" +
                    "This dish is full of flavor and goes well with any kind of bread or rice. You can adjust the spice level according to your taste.\n";

        } else if (selectedIngredients.contains("Potatoes") &&
                selectedIngredients.contains("Tomato") &&
                selectedIngredients.contains("Onion") &&
                selectedIngredients.contains("Green Chili") &&
                selectedIngredients.contains("Garlic") &&
                selectedIngredients.contains("Cumin") &&
                selectedIngredients.contains("Turmeric")){
            return "Here's a recipe for Aloo Tamatar ki Sabzi using the ingredients you provided:\n" +
                    "\n" +
                    "Ingredients:\n" +
                    "- 3 medium-sized potatoes, peeled and diced into small cubes\n" +
                    "- 2 large tomatoes, finely chopped\n" +
                    "- 1 medium-sized onion, finely chopped\n" +
                    "- 2 green chilies, chopped\n" +
                    "- 2-3 garlic cloves, minced\n" +
                    "- 1 teaspoon cumin seeds\n" +
                    "- 1/2 teaspoon turmeric powder\n" +
                    "- Salt, to taste\n" +
                    "- Water, as needed\n" +
                    "- 2 tablespoons oil\n" +
                    "\n" +
                    "Instructions:\n" +
                    "1. Heat oil in a pan over medium heat. Add cumin seeds and allow them to splutter.\n" +
                    "2. Add chopped onions and sauté until they turn golden brown.\n" +
                    "3. Add chopped green chilies and minced garlic. Saute for a few seconds.\n" +
                    "4. Add chopped tomatoes and stir well. Cook until the tomatoes turn soft and mushy.\n" +
                    "5. Add diced potatoes, turmeric powder, and salt. Mix well.\n" +
                    "6. Add water as needed, cover the pan and let the potatoes cook until they are soft and tender. Stir occasionally.\n" +
                    "7. Once the potatoes are cooked, mash them slightly with the back of a spoon or a potato masher.\n" +
                    "8. Stir the mashed potatoes into the tomato mixture and let it cook for a few minutes on low heat.\n" +
                    "9. Adjust salt if needed and serve hot with roti or rice.\n" +
                    "\n" +
                    "Enjoy your delicious Aloo Tamatar ki Sabzi!\n";

        } else if (selectedIngredients.contains("Cauliflower") &&
                selectedIngredients.contains("Green Chili") &&
                selectedIngredients.contains("Tomato") &&
                selectedIngredients.contains("Onion") &&
                selectedIngredients.contains("Garlic") &&
                selectedIngredients.contains("Cumin") &&
                selectedIngredients.contains("Turmeric")) {
            return "Here is the recipe for Gobi ki Sabzi using the ingredients you mentioned:\n" +
                    "\n" +
                    "Ingredients:\n" +
                    "- 1 medium-sized cauliflower, chopped into florets\n" +
                    "- 1 medium-sized onion, chopped\n" +
                    "- 2 tomatoes, chopped\n" +
                    "- 2-3 green chilies, chopped\n" +
                    "- 4-5 garlic cloves, chopped\n" +
                    "- 1 teaspoon cumin seeds\n" +
                    "- 1/2 teaspoon turmeric powder\n" +
                    "- Salt, to taste\n" +
                    "- Oil, for cooking\n" +
                    "\n" +
                    "Instructions:\n" +
                    "1. Heat 2-3 tablespoons of oil in a pan and add cumin seeds. Once they start to sputter, add chopped garlic and green chilies. Saute for a few seconds until the garlic turns slightly golden.\n"+
                    "2. Add chopped onions and saute until they turn translucent.\n" +
                    "3. Add chopped tomatoes and cook until they turn mushy.\n" +
                    "4. Add turmeric powder and salt, and mix well.\n" +
                    "5. Add chopped cauliflower florets and Mix everything well.\n" +
                    "6. Cover the pan and let the vegetables cook on medium flame for about 10-15 minutes. Stir occasionally.\n" +
                    "7. Once the cauliflower are cooked, remove the lid and cook for another 2-3 minutes to dry out the excess moisture.\n"+
                    "8. Garnish with chopped coriander leaves and serve hot with roti or rice.\n" +
                    "\n" +
                    "Your Gobi Matar ki Sabzi is ready to be enjoyed!\n";

        } else if (selectedIngredients.contains("Cumin") &&
                selectedIngredients.contains("Turmeric") &&
                selectedIngredients.contains("Eggplant") &&
                selectedIngredients.contains("Tomato") &&
                selectedIngredients.contains("Onion") &&
                selectedIngredients.contains("Green Chili") &&
                selectedIngredients.contains("Garlic")) {
            return "Here's a simple recipe for Baingan Bharta using the ingredients you provided:\n" +
                    "\n" +
                    "Ingredients:\n" +
                    "- 1 large eggplant\n" +
                    "- 2 medium tomatoes\n" +
                    "- 1 medium onion\n" +
                    "- 2-3 green chilies\n" +
                    "- 4-5 garlic cloves\n" +
                    "- 1 teaspoon cumin seeds\n" +
                    "- 1/2 teaspoon turmeric powder\n" +
                    "- Salt, to taste\n" +
                    "- Oil, for cooking\n" +
                    "\n" +
                    "Instructions:\n" +
                    "1. Preheat the oven to 200°C (400°F). Cut the eggplant in half lengthwise and coat the cut sides with a little oil. Place on a baking sheet, cut-side down, and bake for 25-30 minutes, or until the flesh is soft and tender. Once done, allow it to cool, and then scoop out the flesh and discard the skin.\n"+
                    "2. Finely chop the onion, tomatoes, green chilies, and garlic.\n" +
                    "3. Heat 2 tablespoons of oil in a pan and add the cumin seeds. Once they start to sizzle, add the chopped onion and sauté until it turns golden brown.\n" +
                    "4. Add the chopped garlic and green chilies to the pan and sauté for 2-3 minutes.\n" +
                    "5. Add the chopped tomatoes to the pan and cook until they turn mushy.\n" +
                    "6. Add the turmeric powder and salt to the pan and mix well.\n" +
                    "7. Add the scooped-out eggplant to the pan and mix well with the tomato-onion mixture.\n" +
                    "8. Cook the mixture for 5-6 minutes, stirring occasionally.\n" +
                    "9. Turn off the heat and let the Baingan Bharta rest for a few minutes before serving.\n" +
                    "\n" +
                    "Your Baingan Bharta is ready! You can serve it with naan or rice. Enjoy!\n";

        } else if (selectedIngredients.contains("Green Chili") &&
                selectedIngredients.contains("Cumin") &&
                selectedIngredients.contains("Garlic")) {
            return "Here's a simple recipe for Hirvi Mirchi Cha Thecha using the ingredients you provided:\n"+
                    "\n" +
                    "Ingredients:\n" +
                    "- 10-12 cloves of garlic\n" +
                    "- 8-10 green chilies (adjust according to your spice preference)\n" +
                    "- 1 teaspoon cumin seeds\n" +
                    "- Salt to taste\n" +
                    "\n" +
                    "Instructions:\n" +
                    "1. Heat a small pan over medium heat and dry roast the cumin seeds for about a minute until they turn aromatic. Remove from heat and set aside to cool.\n" +
                    "2. Peel the garlic cloves and roughly chop them.\n" +
                    "3. Slit the green chilies lengthwise and remove the seeds if you prefer a milder flavor.\n" +
                    "4. In a mortar and pestle or a food processor, add the chopped garlic, green chilies, roasted cumin seeds, and a pinch of salt.\n" +
                    "5. Grind or crush the ingredients together until you achieve a coarse paste. Alternatively, you can use a blender or mixer grinder, but be careful not to over-blend; the texture should be coarse.\n" +
                    "6. Taste the thecha and adjust the salt and spice level according to your preference. You can add more salt or green chilies if desired.\n" +
                    "7. Transfer the Hirvi Mirchi Cha Thecha to a clean, airtight jar or container.\n" +
                    "8. Serve the thecha as a spicy accompaniment to meals or as a condiment with bhakri (Indian bread), paratha, or any other dish of your choice.\n" +
                    "\n" +
                    "Note: Hirvi Mirchi Cha Thecha is a spicy chutney, so adjust the quantity of green chilies according to your taste and spice tolerance.\n" +
                    "\n" +
                    "Enjoy the fiery flavors of Hirvi Mirchi Cha Thecha!";
        }
        else {
            return "No recipe found with the selected ingredients.";
        }
    }

    public void reset() {
        I1.setChecked(false);
        I2.setChecked(false);
        I3.setChecked(false);
        I4.setChecked(false);
        I5.setChecked(false);
        I6.setChecked(false);
        I7.setChecked(false);
        I8.setChecked(false);
        I9.setChecked(false);
    }
    private void startNextActivity(List<String> selectedIngredients, String suggestedRecipe) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("recipe", suggestedRecipe);
        intent.putStringArrayListExtra("ingredients", (ArrayList<String>) selectedIngredients);
        startActivity(intent);
    }
}
