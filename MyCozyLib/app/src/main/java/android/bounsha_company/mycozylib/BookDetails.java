package android.bounsha_company.mycozylib;

import androidx.appcompat.app.AppCompatActivity;

import android.bounsha_company.mycozylib.models.Book;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class BookDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        // initialize the data to display
        TextView textViewTitle = findViewById(R.id.text_book_details_title);
        TextView textViewSubtitle = findViewById(R.id.text_book_details_subtitle);
        TextView textViewAuthor = findViewById(R.id.text_book_details_author);
        TextView textViewEditor = findViewById(R.id.text_book_details_editor);
        TextView textViewPublishedDate = findViewById(R.id.text_book_details_published_date);
        TextView textViewPageCount = findViewById(R.id.text_book_details_page_count);
        TextView textViewDescription = findViewById(R.id.text_book_details_description);

        // display the data
        Book book = (Book) getIntent().getSerializableExtra("book");
        textViewTitle.setText(book.getTitle());
        textViewSubtitle.setText(book.getSubtitle());
        textViewAuthor.setText(book.getAuthors());
        textViewEditor.setText(book.getEditor());
        textViewPageCount.setText(getResources().getString(R.string.text_book_page_count) + ": " + String.valueOf(book.getPageCount()));
        textViewPublishedDate.setText(getResources().getString(R.string.text_book_published_date) + ": " +String.valueOf(book.getPublishedDate()));
        textViewDescription.setText(book.getDescription());
        //bookPicture.setImageURI(book.getImage());

        // initialize the button to go back
        ImageButton backButton = findViewById(R.id.btn_book_details_back);
        backButton.setOnClickListener( view ->
        {
            finish();
        });
    }

}