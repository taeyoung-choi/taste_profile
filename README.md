### Cross-Domain Recommendations Using Users’ Taste Profiles

#### COMPUTING SYSTEMS FOR DATA SCIENCE

TaeYoung Choi, Aakanksha Joshi, DongGu Kim, Ryan Serrao

#### Data

Amazon Product Data
- Digital Music Reviews: 836,006 ratings from 478,235 users.
- Books Reviews: 22,507,155 ratings from 8,026,324 users.

The number of unique users, who rated both Books and Digital Music: 207,448

The number of unique albums that is been rated by the 207,448 users: 179,864

Of those 179,864 albums, the number of albums that contains title information: 5,067

Million Song Data
- Metadata on 1,000,000 songs 

Joined Amazon Product data and Million Song data on "album name". Amazon Product Data gives ratings on Albums rather than individual songs. We create features on Albums by aggregating metadata of songs within Albums.

#### Music Taste Profile
- Weighted Average based on ratings for each user
- Exponential Decay based on dates (older ratings carry less weights)

#### Book Recommendation with Book Ratings
##### Approach
- KNN on Rating Matrix
- Matrix Factorization to create a dense matrix ?
- Possible Similarities : Inner Product, Cosine Similarity, Pearson Correlation, Jaccard Similarity, Euclidean
- Matrix Factorization to create a dense matrix ?
##### Evaluation


#### Book Recommendation with Music Taste Profile
##### Approach
- KNN on Music Taste Profile
- Matrix Factorization for a fair comprison with Book Ratings Recommendation ?

##### Evaluation

#### Book Recommendation with Book Ratings + Music Taste Profile
##### Approach
- KNN on Rating Matrix + Music Taste Profile
- Matrix Factorization to create a dense matrix ?
##### Evaluation

