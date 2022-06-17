// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random quote to the page.
 */
 
function addRandomQuote() {
  const quotes =
      ['Time is Greater than Money.', 'Sometimes, a truce is the most important part of the war.', 
       'Say my name.', 'I am the one who knocks.'];

  // Pick a random quote.
  const quote = quotes[Math.floor(Math.random() * quotes.length)];

  // Add it to the page.
  const quoteContainer = document.getElementById('quote-container');
  quoteContainer.innerText = quote;
}

async function showFact() {
    const responseFromServer = await fetch('/fact');
    let response = await responseFromServer.json();

    const currentFact = document.getElementById('fact-container').innerText;
    const factContainer = document.getElementById('fact-container');

    let filtered = response.filter(e => e !== currentFact)
    const idx = Math.floor(Math.random() * filtered.length);
    const funFact = filtered[idx]

    factContainer.innerText = funFact;
}

let map;
const baruchCoordinates = { lat:40.7404, lng:-73.9832 };
const townsendCoordinates = { lat:40.7350, lng:-73.8213 };
const googleCoordinates = { lat: 37.7897, lng: -122.3901 };

function initMap() {
    map = new google.maps.Map(document.getElementById("map"), {
    center: baruchCoordinates,
    zoom: 10,
    });
  
    const college = new google.maps.Marker({
        position: baruchCoordinates,
        map: map,
        title: 'University',
        label: {
            text: 'University',
            fontWeight: 'bold',
        },
    });

    const highSchool = new google.maps.Marker({
        position: townsendCoordinates,
        map: map,
        title: 'High School',
        label: {
            text: 'High School',
            fontWeight: 'bold',
        },
    });

    const dreamJob = new google.maps.Marker({
        position: googleCoordinates,
        map: map,
        title: 'Google',
        label: {
            text: 'Dream Job',
            fontWeight: 'bold',
        },
    });
}



